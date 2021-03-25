package chapter10.sample.wait;

public class SerbestBolge {

	private int veri;
	private boolean mevcut = false;


	public synchronized int veriAl() {

		while (mevcut == false) {
			try {
				wait(); // dikkat
			} catch (InterruptedException e) { }
		}
		mevcut = false;
		notifyAll();// bekleyen tum is parcaciklarini uyandir
		return veri;
	}

	public synchronized void veriKoy(int gelenVeri) {

		while (mevcut == true) {
			try {
				wait(); // dikkat
			} catch (InterruptedException e) { }
		}

		veri = gelenVeri;
		mevcut = true;
		notifyAll(); // bekleyen tum is parcaciklarini uyandir
	}
}



