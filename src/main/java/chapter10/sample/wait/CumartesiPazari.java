package chapter10.sample.wait;

class Uretici extends Thread {
    
    private SerbestBolge sb;

    public Uretici(SerbestBolge sbl) {
        sb  = sbl;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sb.veriKoy(i);
            System.out.println("Uretici - koyulan veri: " + i);
            
	    try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}




class Tuketici extends Thread {
    
    private SerbestBolge sb;

    public Tuketici(SerbestBolge sbl) {
        sb  = sbl;
    }

    public void run() {
        int deger = 0;
        for (int i = 0; i < 10; i++) {
            deger = sb.veriAl();
            System.out.println("Tuketici - alinan veri: " + deger);
	    try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}




public class CumartesiPazari {

    public static void main(String args[]) {
	
	SerbestBolge sb = new SerbestBolge() ;
	Uretici  u = new Uretici(sb);
	Tuketici t = new Tuketici(sb);
	
	
	u.start();
	t.start();
	
    }
}
