package cn.itcast.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class LiyuchunProxy {
	
	private Person chunchun = new Liyuchun();
	
	
	//Demo----  Person person = LiyuchunProxy.createProxy();   person.sing(�����㰮�㡰)  person.dance();
	public Person createProxy(){
		
		return (Person) Proxy.newProxyInstance(LiyuchunProxy.class.getClassLoader(), chunchun.getClass().getInterfaces(),new InvocationHandler(){

			/*
			 * proxy:�Ѵ�����������ݽ���
			 * method:����ǰ���õķ���
			 * args:���÷����Ĳ���
			 * 
			 */
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				String methodname = method.getName();
				if(methodname.equals("sing")){
					System.out.println("��10��������");
					return method.invoke(chunchun, args);  //ллӴ����
				}else if(methodname.equals("dance")){
					System.out.println("��20��������");
					return method.invoke(chunchun, args);
				}else{
					System.out.println("���粻֧���������");				
				}
				return null;
			}
			
		});
	}
	
}
