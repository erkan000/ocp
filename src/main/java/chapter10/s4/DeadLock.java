package chapter10.s4;

public class DeadLock {

	public static void main(String[] args) {
		Tester paul = new Tester();
		Developer selvan = new Developer();
		AndroidApp androidApp = new AndroidApp(selvan, paul);
		iPhoneApp iPhoneApp = new iPhoneApp(selvan, paul);
		androidApp.start();
		iPhoneApp.start();

	}

}

class Developer {
	synchronized void fixBugs() {
		System.out.println("fixing..");
	}
	synchronized void code() {
		System.out.println("coding..");
	}
}
class Tester {
	synchronized void testAppln() {
		System.out.println("testing..");
	}
}
class AndroidApp extends Thread {
	Developer dev;
	Tester tester;
	AndroidApp(Developer dev, Tester t) {
		this.dev = dev;
		this.tester = t;
	}
	public void run() {
		synchronized(tester) {
			tester.testAppln();
			dev.fixBugs();
		}
	}
}
class iPhoneApp extends Thread {
	Developer dev;
	Tester tester;
	iPhoneApp(Developer dev, Tester t) {
		this.dev = dev;
		this.tester = t;
	}
	public void run() {
		synchronized(dev) {
			dev.code();
			tester.testAppln();
		}
	}
}