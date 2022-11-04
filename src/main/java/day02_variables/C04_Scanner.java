package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

        Scanner input =new Scanner(System.in);
        System.out.println(" Dört basamakli sayi giriniz...");
        int sayi = input.nextInt();
        int top = (sayi/1000)+(sayi%10);
        System.out.println(top);


        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        Scanner input1 =new Scanner(System.in);
        System.out.println(" Üc basamakli sayi giriniz...");
        int sayi1 = input1.nextInt();
        int birler = (sayi1%10);
        System.out.println("birler basamagi =" + birler );
        int yeniSayi = sayi1/10;
        int onlar = yeniSayi%10;
        System.out.println("onlar basamagi =" + onlar);
        int yuzler = yeniSayi/10;
        System.out.println("yuzler basamagi =" + yuzler);




        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12

    }


}
