package day03_ifStatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

        char harf ='a';
        char harf2= 'A';
        System.out.println("harf>harf2 ==>"  +(harf>harf2));
        // true karsilastirma islemlerinin sonucunu boolean true yada false doner.
        //Buyuk harflerin ASCII degerlerinden daha kucuktur.
        //1) Herhangi bir char variable nin ASCII degerlerini kod yazarak bulunuz.

        //1. yol

        char space=' ';

        System.out.println("space nin ASCII degeri =" +( 0+space));
        //32 space nin Ascii degerini hesaplamak icin toplamaya etkisi olmayan '0' ile toplariz Boylece yazdirdigimiz
        // deger bize space in ASCII degerini verir.

        char m = 'm';
        System.out.println("m nin Ascii degeri ="+( m+0));

        // 2. yol


        int harf3 = 'm';
        System.out.println("m nin ASCII degeri =" +harf3);
        //char larda Java karakterlere int da atayabiliriz.
        //Cünkü char in bir resmi karakteri bir de matematiksel Ascii degerleri vardir.
        // bu nedenle Ascii degerlerini hesaplayabiliriz.

        byte b1 = 12;
        byte b2 =-125;
        System.out.println("b1>b2 ==>" + (b1>b2));


        float f1 = 12.38465F;
        float f2 = 12.8596736F;
        System.out.println("f1>f2 ==>"  +(f1>f2));
        System.out.println(("b1>f1 ==>"+(b1>f1) ));

        long long1 = 15667788L;
        System.out.println("b1< long1 ==>"  +(b1<long1));


    }



}
