package chapter2.s1;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	void eat() {
		System.out.println(getName() + " eaten.");		
	}

}
