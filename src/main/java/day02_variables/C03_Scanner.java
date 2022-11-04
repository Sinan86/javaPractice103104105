package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

       /* Scanner input =new Scanner(System.in);
        System.out.println("Lutfen Adinizi giriniz...");
        String isim =input.next();


        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
        //( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )


        Scanner scan = new Scanner(System.in);
        System.out.println("Cemberin yari capini giriniz");
        double r =scan.nextDouble();

        System.out.println("Cemberin cevresi = " + 2*314*r/100);
        System.out.println("Cemberin Alani = " + r*r*314/100);


        Scanner asd = new Scanner(System.in);
        System.out.println("kisa kenarinin uzunlugunu giriniz");

        double k = asd.nextDouble();
        System.out.println("uzun kenarinin uzunlugunu giriniz");
        double u = asd.nextDouble();
        System.out.println("Dikdortgenin cevresi =" +2*(k+u));
        System.out.println("Dikdortgenin alani =" + k*u);






        Scanner input3 =new Scanner(System.in);
        System.out.println("ücgeninin kenar uzunluklarini giriniz");
        byte a= input3.nextByte();
        byte b= input3.nextByte();
        byte c= input3.nextByte();
        int cevre = a+b+c;

        System.out.println("Ucgenin cevresi="  + cevre);


        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz
*/
/*
             A
            A A
           A A A


        Scanner input4 = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char ch = input4.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);

        //Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz

        Scanner input5 = new Scanner(System.in);
        System.out.println("5 basamakli sayi giriniz...");
        int num = input5.nextInt();
        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkiRkm  = " + ilkIkiRkm);
        int ilkIkiRkmTop = (ilkIkiRkm%10+ilkIkiRkm/10);
        int sonIkiRkmTop = (num%10+ (num/10)%10);
        System.out.println("ilk iki toplam ile son iki toplami =" +ilkIkiRkmTop+sonIkiRkmTop);

        */

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz

        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        Scanner input = new Scanner(System.in);

        System.out.println(" Lutfen 5 basamakli bir sayi giriniz ");

        int num = input.nextInt();
        int ilkIkirkm = num / 1000;
        System.out.println("ilkIkirkm = " + ilkIkirkm);//12

        int ilkIkiTop = (ilkIkirkm % 10) + (ilkIkirkm / 10);//2+1
        System.out.println("ilkIkiTop = " + ilkIkiTop);//3

        int sonIkiRkm = num % 100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);//45
        int sonIkiTop = (sonIkiRkm % 10) + (sonIkiRkm / 10);//5+4
        System.out.println("sonIkiTop = " + sonIkiTop);


        int toplam = ilkIkiTop + sonIkiTop;
        System.out.println("toplam = " + toplam);
    }}






