package chapter1.s2;

class Instrument {
	
	Instrument() {
		System.out.println("Parent constructor");
	}
	{
		System.out.println("Parent instance initialization");
	}
	static{
		System.out.println("Parent Static initialization");
	}
}

class Pencil extends Instrument {
	public Pencil() {
		System.out.println("Child constructor");
	}
	{
		System.out.println("Child instance initializer");
	}
	static{
		System.out.println("Child Static initialization");
	}

}

public class Initializers {
	public static void main(String[] args) {
		new Pencil();
	}
}
