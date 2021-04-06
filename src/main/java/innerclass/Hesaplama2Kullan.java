package innerclass;

class Hesaplama33 {  

	public class Toplama2 { //Uye dahili sinif   -  public 
		public  int toplamaYap(int a, int b) {
			return a + b ; 
		}
	}  // class Toplama2

	protected  class Cikartma2 {	//Uye dahili sinif - protected 
		public  int cikartmaYap(int a, int b) {
			return a - b ; 
		}
	}  // class Cikartma2

	class Carpma2 { //Uye dahili sinif -friendly
		public  int carpmaYap(int a, int b) {
			return a * b ; 
		}
	}  // class Carpma2

	private class Bolme2 { //Uye dahili sinif - private 
		public  int bolmeYap(int a, int b) {
			return a / b ; 
		}
	}  // class Bolme2   

} // class Hesapla


public class Hesaplama2Kullan {
    public static void main(String args[]) {
		
		Hesaplama33.Toplama2  ht   =   new Hesaplama33().new Toplama2() ;
		Hesaplama33.Cikartma2 hck = new Hesaplama33().new Cikartma2() ;
		Hesaplama33.Carpma2   hcp = new Hesaplama33().new Carpma2() ;
		// Hesaplama33.Bolme3     hb =   new Hesaplama33().new Bolme2() ; // ! Hata ! 

		int sonuc1 = ht.toplamaYap(10,5);
		int sonuc2 = hck.cikartmaYap(10,5);
		int sonuc3 = hcp.carpmaYap(10,5);
	       // int sonuc4 = hb.bolmeYap(10,5); // ! Hata ! 

		System.out.println("Toplama  Sonuc = " + sonuc1 );
		System.out.println("Cikartma Sonuc = " + sonuc2 );
		System.out.println("Carpma   Sonuc = " + sonuc3 );
		
	}

}


