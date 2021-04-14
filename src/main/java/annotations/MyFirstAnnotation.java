package annotations;

public @interface MyFirstAnnotation {

	String author();
	
	int currentVersion() default 1;
	
	String lastModified() default "N/A";
	
	String[] reviewers();
	
}
