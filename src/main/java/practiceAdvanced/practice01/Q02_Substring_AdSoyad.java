package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {

    public static void main(String[] args) {
/*
       // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       //         ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       // Örn:
       // Ad: Ali
       //  Soyad: Can
                */

        Scanner input = new Scanner(System.in);
        System.out.println("adinizi soyadinizi giriniz..");
        String adSoyad =input.nextLine();
        int idx = adSoyad.indexOf(" ");
        String ad =adSoyad.substring(0,idx);
        String soyAd =adSoyad.substring(idx+1);
        System.out.println("isim ="+ad);
        System.out.println("soy isim ="+soyAd);







    }




}
