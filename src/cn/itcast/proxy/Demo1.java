package cn.itcast.proxy;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LiyuchunProxy proxy = new LiyuchunProxy();
		Person person = proxy.createProxy();
		
	/*	String result = person.sing("���㰮��");
		System.out.println(result);*/
		
		String result = person.dance("�ֹ���");
		System.out.println(result);
		

	}

}
