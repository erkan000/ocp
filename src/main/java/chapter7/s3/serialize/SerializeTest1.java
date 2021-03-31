package chapter7.s3.serialize;
import java.io.*; 

class Cember implements Serializable {

	public String isim;    
	public double[] d = { 2.33, 1.44, 9.87, 0.76} ;


	public Cember( String isim) {
		this.isim = isim;
	}
}

public class SerializeTest1 {

	public static void main(String args[]) throws Exception {

		Cember cmb = new Cember("Test Programi2");

		// Yazma i$lemi
		FileOutputStream fos = new  FileOutputStream("cember.nsn");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cmb);
		fos.close();

		// Yazdiklamizi okuyalim
		FileInputStream fis =   new FileInputStream("cember.nsn");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cember cmb2 = (Cember) ois.readObject();
		fis.close();

		System.out.println("c2.isim = " +  cmb2.isim);
		for (int i=0; i<cmb2.d.length; i++) {
			System.out.println("c2.d["+i+"] = " +  cmb2.d[i]); 
		}

	}
}
