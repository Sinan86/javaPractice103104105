package day01_variables;

public class C04_Java_Variables {

    // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin.

    public static void main(String[] args) {

        String okulIsmi= "Sinan Okullari";
        System.out.println("okulIsmi =" + okulIsmi);

        char ilk ='E';
        System.out.print(ilk);
        char ikinci ='S';
        System.out.println(ikinci);

        int plaka = 26;
        System.out.println(plaka);

        String isim = "Sinan";
        System.out.println("Adiniz :" +isim);

        String soyIsim = "Sonmez";
        System.out.println("Soyadiniz :" +soyIsim);

        // 2 farkli tam sayi data turunde 2 variable olusturun bunlarin toplamini yaziniz.

        byte ilkSayi = 32;
        int ikinciSayi = 46;
        System.out.println("toplam = " + (ilkSayi+ ikinciSayi));

        // bir tamsayi bir ondalikli variable olustur. bunlarin toplamini yazdir.

        int deger1 = 345;
        double deger2 =23.4;
        System.out.println("int + double = " + (deger1+ deger2));

// char data typinde bir variable yazdirin-

        char a = 'ß';
        System.out.println("sembol = " +a);

        char v = 'S';
        int y = 36;

        System.out.println("v ile y nin toplami = " +(v+y));

        // Intializing Variable (variable baslangic degeri verme)

        int age =32;

        String yazi = "Hello World";
        System.out.println(yazi);




    }


}
