package day05_IfStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
//Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz"+ "\n Kadin icin K  \n Erkek icin E giriniz..." );
        char cinsiyet = input.next().toUpperCase().charAt(0);

        System.out.println("Yasinizi giriniz...");
        double yas = input.nextDouble();

        if (cinsiyet=='K'){
            if(yas<0 || yas>120) {
                System.out.println("Lutfen dogru yas giriniz...");
            } else if (60<yas) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olamazsin " + (60-yas)+ "calismalisin...");


            }
        } else if (cinsiyet=='E') {
            if(yas<0 || yas>120) {
                System.out.println("Lutfen dogru yas giriniz...");
            } else if (yas>64) {
                System.out.println("Emekli olabilirsiniz...");

            } else if (65>yas) {
                System.out.println("Emekli olamazsin " + (65-yas)+ "calismalisin...");

            }

        }
    }


    }

