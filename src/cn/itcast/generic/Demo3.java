package cn.itcast.generic;

import java.util.ArrayList;
import java.util.Collection;

public class Demo3 {

	
	public void test(){
		print(new ArrayList<String>());
	}
	
	
	public void print(Collection<?> c){
		
		//只要使用到?通配符，就不能调用与泛形相关的方法
		//c.add(1);
		c.size();
		
	}
}
