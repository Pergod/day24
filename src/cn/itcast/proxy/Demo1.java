package cn.itcast.proxy;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LiyuchunProxy proxy = new LiyuchunProxy();
		Person person = proxy.createProxy();
		
	/*	String result = person.sing("°®Äã°®Äã");
		System.out.println(result);*/
		
		String result = person.dance("¸Ö¹ÜÎè");
		System.out.println(result);
		

	}

}
