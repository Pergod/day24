package cn.itcast.generic;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3 {

	
	public void test(){
		print(new ArrayList<String>());
	}
	
	
	public void print(Collection<?> c){
		
		//ֻҪʹ�õ�?ͨ������Ͳ��ܵ����뷺����صķ���
		//c.add(1);
		c.size();
		
	}
}
