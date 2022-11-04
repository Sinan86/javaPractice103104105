package practiceAdvanced.practice04.inheretence;

public class Q06_Static_Butce_Runner {
    //Basit bir ev butcesi olusturunuz.
    public static void main(String[] args) {

        Butce baba =new Butce();
        System.out.println("Maas öncesi "+Butce.butce);
        baba.maasAl(5000);
        System.out.println("Maas sonrasi Butce " +Butce.butce);
        System.out.println(baba.harclik);
        baba.harclikAl(500);
        System.out.println(baba.harclik);
        System.out.println(Butce.butce);
        baba.harclikHarca(266);
        baba.butcedenHarca(1000);
        System.out.println("Butce: "+ Butce.butce);
        System.out.println("Harclik: "+baba.harclik);
        Butce anne =new Butce();
        anne.maasAl(2000);
        anne.harclikAl(700);
        anne.harclikHarca(300);
        System.out.println("Butce: "+ Butce.butce);




    }
}
