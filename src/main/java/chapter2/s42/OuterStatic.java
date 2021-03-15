package chapter2.s42;

public class OuterStatic {
	
	static int outerStatic = 10;
	int outerInstance = 20;
	
	protected static class StaticNested {
		protected static int innerStatic = 10;
		protected int innerInstance = 20;
		
	}
	
	void function() {
		StaticNested ss = new StaticNested();
		int i = ss.innerStatic;
		i = StaticNested.innerStatic;
		i = ss.innerInstance;
	}

}
