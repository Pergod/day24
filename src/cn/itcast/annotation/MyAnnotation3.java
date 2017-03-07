package cn.itcast.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation3 {

	//Ãÿ ‚ Ù–‘value
	String value();
	
	String name();
	
}
