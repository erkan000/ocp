package override;

public class Person {

	public void makeSomething() {
		process();
		// burada process private olsa aşağıdakini çağırırdı, şu anda üsttekini
		// çağırıyor!
	}

	protected void process() {
		System.out.println("Person process");
	}

}
