package chapter10.s2;

import java.util.concurrent.TimeUnit;

class ScreenDesign extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
class Developer {
	ScreenDesign design;
	Developer(ScreenDesign design) {
		this.design = design;
	}
	public void code() {
		try {
			System.out.println("Waiting for design to complete");
			design.join();
			System.out.println("Coding phase start");
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
public class ThreadJoin {

	public static void main(String[] args) {
		ScreenDesign design = new ScreenDesign(); 
		design.start();
		Developer dev = new Developer(design);
		dev.code();
	}
}