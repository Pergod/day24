package cn.itcast.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation3 {

	//��������value
	String value();
	
	String name();
	
}
