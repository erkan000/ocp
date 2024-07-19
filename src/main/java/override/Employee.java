package override;

public class Employee extends Person {

	public void test() {
		super.makeSomething();
	}

	@Override
	public void process() {
		System.out.println("Employee process");
	}

}
