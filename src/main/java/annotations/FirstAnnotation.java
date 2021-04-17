package annotations;

public @interface FirstAnnotation {
//	TestClass a(); sınıf derlenenmez
	
	Color c();
	
	Snow snow() default @Snow(true);
}


enum Color {GREY, BROWN}


@interface Snow{
	boolean value() default false;
}


class TestClass {}