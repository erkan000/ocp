package innerclass;

 class Hesaplama2 {  

	public class Toplama2 { //Uye dahili sinf   -  public 
		public  int toplamaYap(int a, int b) {
			return a + b ; 
		}
	}  // class Toplama

	protected  class Cikartma2 {	//Uye dahili sinf - protected 
		public  int cikartmaYap(int a, int b) {
			return a - b ; 
		}
	}  // class Cikartma

	class Carpma2 { //Uye dahili sinf -friendly
		public  int carpmaYap(int a, int b) {
			return a * b ; 
		}
	}  // class Carpma

	private class Bolme3 { //Uye dahili sinf - private 
		public  int bolmeYap(int a, int b) {
			return a / b ; 
		}
	}  // class Bolme   

} // class Hesapla


public class Hesaplama3Kullan {
    public static void main(String args[]) {
		
		Hesaplama2.Toplama2  ht   =   new Hesaplama2().new Toplama2() ;
		Hesaplama2.Cikartma2 hck = new Hesaplama2().new Cikartma2() ;
		Hesaplama2.Carpma2   hcp = new Hesaplama2().new Carpma2() ;
		// Hesaplama2.Bolme3     hb =   new Hesaplama2().new Bolme3() ; // ! Hata ! 

		int sonuc1 = ht.toplamaYap(10,5);
		int sonuc2 = hck.cikartmaYap(10,5);
		int sonuc3 = hcp.carpmaYap(10,5);
	       // int sonuc4 = hb.bolmeYap(10,5); // ! Hata ! 

		System.out.println("Toplama  Sonuc = " + sonuc1 );
		System.out.println("Cikartma Sonuc = " + sonuc2 );
		System.out.println("Carpma   Sonuc = " + sonuc3 );
		
	}

}


