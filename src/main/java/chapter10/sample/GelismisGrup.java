package chapter10.sample;

class Siraliyici {
	public static void sirala(ThreadGroup tg) {		
		System.out.println("-----------");
		int toplamSayi = tg.activeCount();
		Thread[] ipDizisi = new Thread[toplamSayi];
		tg.enumerate(ipDizisi);
		for (int i=0; i<ipDizisi.length; i++) {
		   System.out.println("benim ismim " + ipDizisi[i].getName());
		}
	}
}

class GelismisTakimOyuncusu implements Runnable  {
	public void run() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException iEx) {}		
	}
}

public class GelismisGrup {

	public static void main(String[] args) {

		ThreadGroup siyahGrup = new ThreadGroup("siyah grup");
		ThreadGroup beyazGrup = new ThreadGroup("beyaz grup");

		GelismisTakimOyuncusu gto1 = new GelismisTakimOyuncusu();
		GelismisTakimOyuncusu gto2 = new GelismisTakimOyuncusu();
		GelismisTakimOyuncusu gto3 = new GelismisTakimOyuncusu();
		GelismisTakimOyuncusu gto4 = new GelismisTakimOyuncusu();

		GelismisTakimOyuncusu gto5 = new GelismisTakimOyuncusu();
		GelismisTakimOyuncusu gto6 = new GelismisTakimOyuncusu();

		Thread t1 = new Thread(siyahGrup, gto1,"A1");
		Thread t2 = new Thread(siyahGrup, gto2,"B1");
		Thread t3 = new Thread(siyahGrup, gto3,"C1");
		Thread t4 = new Thread(siyahGrup, gto4,"D1");
		siyahGrup.list();
		
		Thread t5 = new Thread(beyazGrup, gto5,"E1");
		Thread t6 = new Thread(beyazGrup, gto6,"F1");
		beyazGrup.list();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

		System.out.println("");
		Siraliyici.sirala(beyazGrup);
		Siraliyici.sirala(siyahGrup);
		

	}    
}
