package z.annotations2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Geometri {

	String sekil();
	
	int kenar() default 0;
	
	int cap() default 0;
	
}