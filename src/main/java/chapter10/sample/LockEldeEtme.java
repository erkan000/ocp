package chapter10.sample;

class Hesap {

	private double miktar = 0; 

	public  double paraYatir(double m) {
		this.miktar += m ; 
		return miktar;
	}

	public  void paraCek(double m) {
		if (this.miktar < 0) {
			System.out.println("Bakiye yetersiz " + this.miktar);
			return;
		}
		this.miktar -= m ; 
	}

	public double miktariOgren() {
		return miktar;
	}
}

class CalisanBir extends Thread {

	Hesap gh ; 

	public CalisanBir( String isim, Hesap gh) {
		super(isim);
		this.gh = gh ;
	}

	public void run() {
		try {
			synchronized(gh) {
				double miktar = gh.miktariOgren();
				double ilkMiktar = miktar;
				gh.paraYatir(100);
				gh.paraYatir(100);
				gh.paraCek(150);
				miktar = gh.miktariOgren();
				System.out.println(currentThread().getName()+"-->" + ilkMiktar + " + 100 + 100 - 150 =" + miktar );
				sleep(3000);
			}
		} catch (InterruptedException iEx) {
			iEx.printStackTrace();
		}
	}
}

class CalisanIki extends Thread {

	Hesap gh ; 

	public CalisanIki( String isim, Hesap gh) {
		super(isim);
		this.gh = gh;
	}

	public void run() {
		synchronized(gh) {
			double miktar = gh.miktariOgren();
			double ilkMiktar = miktar;
			gh.paraYatir(200);
			gh.paraCek(50);
			gh.paraYatir(100);
			miktar = gh.miktariOgren();
			System.out.println(currentThread().getName()+"-->" + ilkMiktar + " + 200 - 50 + 100 =" + miktar );
		}
	}
}

public class LockEldeEtme {

	public static void main(String args[]) throws Exception {

		Hesap gh = new Hesap();

		CalisanBir gbc1 = new CalisanBir("GelismisBankaCalisaniBir", gh);
		
		CalisanIki gbc2 = new CalisanIki("GelismisBankaCalisaniIki", gh);

		gbc1.start();
		gbc2.start();

	}
}

