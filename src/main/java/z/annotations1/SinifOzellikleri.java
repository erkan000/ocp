package z.annotations1;

public @interface SinifOzellikleri {

	String author();
	
	String date();
	
	int currentVersion() default 1;
	
	String lastModified() default "N/A";
	
	String[] reviewers();
	
}
