package day05_IfStatement;

import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //ve dikdortgenin kare olup  olmadigini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci kenar uzunlugunu giriniz...");
        double a = input.nextDouble();
        System.out.println("Lütfen ikinci kenar uzunlugunu giriniz...");
        double b = input.nextDouble();
        if (a > 0 && 0 < b) {
            if (a == b) {
                System.out.println("Kare... ");

            } else {
                System.out.println("Dikdortgen ...");
            }
        } else {
            System.out.println("Gecerli bir uzunluk giriniz...");


        }

    }

}