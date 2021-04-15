package innerclass;


class AnaSinif {
    public void ekranaBas(String deger) {
        System.out.println( deger );
    }
}

class B {
    public String degerDondur() {
        return "B"; 
    }
}

class C {
    public int  topla(int a , int b) {
        return a+b ;
    }
}

public class TuretilmisSinif  extends AnaSinif {

    public class BB extends B {
        public BB() {    // yapilandirici
            ekranaBas( "Sonuc = " + degerDondur() );
        }

    }

    public class CC extends C { 
        public CC( int a , int b ) { // yapilandirici
            ekranaBas("Sonuc = " + topla(a,b) );
        }
    }

    public  static void main( String args[] ) {
           TuretilmisSinif.BB tbb  = new TuretilmisSinif().new BB();
           TuretilmisSinif.CC tcc  = new TuretilmisSinif().new CC( 6 , 9 );

    }

}
