package innerclass;


class Motor {
    
    public void calis() {
        System.out.println("Motor Calisiyor");
    }

    public void dur() {
        System.out.println("Motor Durdu");
    }

}


public class YarisArabasi {

    public void hizYap() {
        System.out.println("YarisArabasi hiz yapiyor");
    }

    public class SuperMotor extends Motor {
        
        public void calis() {    // iptal etti (override)
            System.out.println("SuperMotor Calisiyor");

        }
        public void dur() {    // iptal etti (override)
            System.out.println("SuperMotor Durdu");

        }
    }


}
