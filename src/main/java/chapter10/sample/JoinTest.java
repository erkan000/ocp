package chapter10.sample;

public class JoinTest {
	
	public static void main(String args[]) {

		Yakit yakit = new Yakit("Yak�t");
		Robot5 robot = new Robot5("Robot", yakit);

		robot.start();
		yakit.start();
	}
}

class Robot5 extends Thread {

	private Yakit yakit;

	public Robot5( String isim, Yakit yak) {
		super(isim);
		this.yakit = yak ;
	}

	public void run() {
		try {
			System.out.println(this.getName() + " yak�t al�m�n� beklemeye basliyor");

			yakit.join();			// 	yakit bitene kadar bekle
			//r337.join(150); 		//  yakit i 150 ms bekle
			//r337.join(150, 90);	//  yakit i 150 ms + 90 ns bekle

			System.out.println(this.getName() + " s�n�f�n�n i�i bitti, devam ediyorum!");
		} catch (InterruptedException  iEx) {
			iEx.printStackTrace();
		}
	}
}

class Yakit extends Thread {

	public Yakit(String isim) {
		super(isim);
	}

	public void run() {
		try {
			System.out.println(this.getName() + " s�n�f� i�ine ba�lad�! 5 saniye s�rer.");
			sleep(5000);
			System.out.println("Yak�t i�i bitti!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}

