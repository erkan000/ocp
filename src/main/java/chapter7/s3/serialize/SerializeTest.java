package chapter7.s3.serialize;
import java.io.*;

public class SerializeTest {

	public static void main(String args[]) throws Exception {

		Robot r = new Robot("Robot bip.. bip.. bip..", 5.1, 2.3);

		// Yazma i$lemi		
		FileOutputStream fos = new  FileOutputStream("robot.nsn");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(r);
		fos.close();
		System.out.println("yazdirma islemi tamamlandi");

		// Yazdiklamizi okuyalim
		FileInputStream fis =   new FileInputStream("robot.nsn");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Robot r2 = (Robot) ois.readObject();
		fis.close();
		System.out.println("okunma islemi tamamlandi");

		System.out.println("r2.isim = " +  r2.isim);
		for (int i=0; i<r2.ilkDegerler.length; i++) {
			System.out.println("r2.d["+i+"] = " +  r2.ilkDegerler[i]); 
		}
		System.out.println("r2.isim = " +  r2.as == null);
	}
}

class AlgilamaSistemi {

	public double girenVeri ;
	public double cikanVeri ;

	public AlgilamaSistemi(double girenVeri, double cikanVeri) {
		this.girenVeri = girenVeri ;
		this.cikanVeri = cikanVeri ;
	}

	public double bilgiHesapla() {
		double sonuc = girenVeri - cikanVeri ;
		return sonuc ;
	}
}

class Robot implements Serializable {

	private static final long serialVersionUID = 3120796376480011074L;	
	public String isim;
	public double[] ilkDegerler = { 1.33, 1.34, 8, 569, 1.64} ;
	transient public AlgilamaSistemi as ;

	public Robot( String isim, double girenVeri, double cikanVeri) {
		this.isim = isim;
		as = new  AlgilamaSistemi(girenVeri, cikanVeri); 
		System.out.println("sonuc = " + as.bilgiHesapla() );
	}
}


