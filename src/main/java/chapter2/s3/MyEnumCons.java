package chapter2.s3;

public enum MyEnumCons {
	
	TEST("localhost"),
	PROD("com.tr"),
	DEV("8080") {
		public String toString() {
			return "WALNUT is Brown in color";
		}
	};

	private String host;
	
	MyEnumCons(String host) {
		this.host = host;
	}
	
	@Override
	public String toString() {
		return "Host: " + host;
	}

}
