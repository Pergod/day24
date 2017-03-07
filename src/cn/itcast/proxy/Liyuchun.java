package cn.itcast.proxy;

public class Liyuchun implements Person {

	public String sing(String name){
		System.out.println("´º¸ç³ª"+name+"¸èÁË£¡£¡");
		return "Ð»Ð»Ó´£¡£¡";
	}
	
	public String dance(String name){
		System.out.println("´º¸çÌø"+name+"ÎèÁË!!");
		return "·ÉÎÇ£¡£¡";
	}
	
	
	
}
