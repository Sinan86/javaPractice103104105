package day05_IfStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        //Soru 8) Kullanicidan maas icin bir teklif isteyin ve
        // asagidaki degerlere gore cevap yazdirin.
        //Teklif 20.000’in uzerinde ise "Kabul ediyorum" ,
        //10000 – 20.000 arasinda ise "Konusabiliriz",
        //10.000’nin altinda ise "Maalesef Kabul edemem" yazdirin


        Scanner input = new Scanner(System.in);
        System.out.println("Maas teklifinizi giriniz...");
        double a = input.nextDouble();
        if (a>20000){
            System.out.println("Kabul eddiyorum");

        } else if (a<20000 && a>10000) {
            System.out.println("Konusabiliriz...");

        }else {
            System.out.println("Kabul edemem...");
        }


    }
}
