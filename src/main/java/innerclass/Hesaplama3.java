package innerclass;

public class Hesaplama3 {
    
    private int sabit1  = 2 ; 
    private static int sabit2 = 1 ;


    public class Toplama3 { //Uye dahili sinif 
                public  int toplamaYap(int a, int b) {
		    return  (a+b) + sabit1  ; 	// dikkat
		}
     }  // class Toplama3

    public class Cikartma3 { //Uye dahili sinif 
	      public  int cikartmaYap(int a, int b) {
		    dekontBilgileriGoster();  // dikkat
		    return  (a-b) -  sabit2  ; 	// dikkat
		}
    }  // class Cikartma3

    
    private void  dekontBilgileriGoster() {
	System.out.println("Dekont Bilgileri Gosteriliyor");

    }

    public void ekranaBas(int a , int b ) {
	     int sonuc = new Toplama3().toplamaYap(a,b);
	     System.out.println("Sonuc  =  " + a +" + " + b  + " +  sabit1  = " + sonuc);
    }



   public static void main(String args[]) {
       
       Hesaplama3 h3 = new Hesaplama3();
       h3.ekranaBas(10,5);

       // Toplama islemi
       Hesaplama3.Toplama3 ht3 = h3.new Toplama3() ;
       int sonuc = ht3.toplamaYap(11,6);
       System.out.println("Sonuc  =  11 + 6 + sabit1  =  " + sonuc );
       
       // Cikartma islemi 
	Hesaplama3.Cikartma3 hc3  = h3.new Cikartma3();
	int sonuc1 = hc3.cikartmaYap(10,5);
	System.out.println("Sonuc  =  10 - 5 -  sabit2  =  " + sonuc1);
     }


} // class Hesaplama3

