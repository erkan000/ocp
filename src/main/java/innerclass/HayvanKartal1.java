package innerclass;


class Hayvan1 {

    static abstract class Kus1 {  
        public abstract void uc ();
        public abstract void kon();
    }

    public void avlan() {
       System.out.println("Hayvan avlaniyor...");
    }
}

class Kartal1 extends Hayvan1.Kus1 {
    public void uc() {
       System.out.println("Kartal1 Ucuyor...");
    }
    public void kon() {
        System.out.println("Kartal1 Konuyor...");
    }

    
     public Kartal1() {  } // dogru

    

    public static void main(String args[]) {
        Kartal1   k1 = new Kartal1();
        k1.uc();
        k1.kon();
    }
     
}
