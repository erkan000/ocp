package chapter7.s3.serialize;
import java.io.*; 



class Robot2 implements Serializable {

	public String isim;    
	public double[] ilkDegerler = { 1.33, 1.34, 8,569, 1.64} ;
	public AlgilamaSistemi as ;

	public Robot2( String isim, double girenVeri, double cikanVeri) {
		this.isim = isim;
		as = new  AlgilamaSistemi(girenVeri, cikanVeri); 
		System.out.println("sonuc = " + as.bilgiHesapla() );
	}
}

public class SerializeTest2 {


	public static void main(String args[]) throws Exception {

		Robot2 r = new Robot2("Robot2 bip.. bip.. bip..", 5.1, 2.3);

		// Yazma i$lemi		
		FileOutputStream fos = new  FileOutputStream("Robot2.nsn");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(r);
		fos.close();
		System.out.println("yazdirma islemi tamamlandi");

		// Yazdiklamizi okuyalim
		FileInputStream fis =   new FileInputStream("Robot2.nsn");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Robot2 r2 = (Robot2) ois.readObject();
		fis.close();
		System.out.println("okunma islemi tamamlandi");

		System.out.println("r2.isim = " +  r2.isim);
		for (int i=0; i<r2.ilkDegerler.length; i++) {
			System.out.println("r2.d["+i+"] = " +  r2.ilkDegerler[i]); 
		}
		System.out.println("r2.isim = " +  r.isim);
	}
}
