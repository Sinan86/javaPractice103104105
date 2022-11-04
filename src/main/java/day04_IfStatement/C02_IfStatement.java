package day04_IfStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif


   */

        Scanner input = new Scanner(System.in);
        System.out.println("Notu giriniz...");
        double not = input.nextDouble();
        if (not > 89 && not < 100) {

            System.out.println('A');


        } else if (not > 79 && not < 90) {
            System.out.println('B');

        } else if (not > 69 && not < 80) {
            System.out.println('C');
        } else if (not > 59 && not < 70) {
            System.out.println('D');

        } else if (not < 60) {
            System.out.println('F');
        } else {
            System.out.println("Notu dogru giriniz...");


        }


        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scr = new Scanner(System.in);
        System.out.println("Gün ismi giriniz...");
        String gunIsmi = scr.next();
        if (gunIsmi.equalsIgnoreCase("Cuma")) {
            System.out.println("Müslümanlar icin mübarek gün");
        } else if (gunIsmi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin mübarek gün");

        } else if (gunIsmi.equalsIgnoreCase("Pazar")) {
            System.out.println("Hiristiyanlar icin mübarek gün");

        } else {
            System.out.println("Hic bir din icin munarek gun degil");


        }
    }
}
