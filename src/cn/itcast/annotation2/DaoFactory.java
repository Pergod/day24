package cn.itcast.annotation2;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DaoFactory {

	public static BookDao createBookDao(){
		
		BookDao dao = new BookDao();
		
		//�ڷ���֮ǰ����daoע��һ����
		
		//������dao��������
		try{
			BeanInfo info = Introspector.getBeanInfo(dao.getClass(),Object.class);
			PropertyDescriptor pds[] = info.getPropertyDescriptors();
			for(int i=0;pds!=null && i<pds.length;i++){
				//�õ�bean��ÿһ������������
				PropertyDescriptor pd = pds[i];
				
				//�õ�������Ӧ��set����
				Method setMethod = pd.getWriteMethod();  
				
				//��set��������û��inject ע��
				Inject inject = setMethod.getAnnotation(Inject.class);
				if(inject==null){
					continue;
				}
				
				//������ע�⣬����ע�����õ���Ϣ������һ�����ӳ�
				Class propertyType = pd.getPropertyType();
				Object datasource = propertyType.newInstance();
				DataSource ds = (DataSource)createDataSourceByInject(inject,datasource);
				setMethod.invoke(dao, ds);
			}
		}catch (Exception e) {
			throw new RuntimeException();
		}
		
		return dao;
	}

	//��ע�����Ϣ��Ϊ����������
	private static Object createDataSourceByInject(Inject inject,Object ds) {
		
		//��ȡ��ע������������Ӧ�ķ���     driverClass url equals hashcode
		Method methods[] = inject.getClass().getMethods();
		for(Method m : methods){
			String methodName = m.getName();  //equals  url()  password()
			
			PropertyDescriptor pd = null;
			try {
				pd = new PropertyDescriptor(methodName,ds.getClass());  //geturl
				
				//�õ�ע�����Ե�ֵ
				Object value  = m.invoke(inject, null);
				pd.getWriteMethod().invoke(ds, value);
			} catch (Exception e) {
				continue;
			}
		}
		
		return ds;
	}
	
}
