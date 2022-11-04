package day01_variables;

import javax.swing.*;
import java.util.Scanner;

public class C05_Scanner {
    // Kullanicidan ad, soyad, memleket, konum yas, boy, javayi sevdiniz mi bilgilerini aliniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad = input.next();

        System.out.println("Soyadinizi giriniz");
        String soyAd = input.next();

        System.out.println("Memleketinizi giriniz");
        String il = input.next();

        System.out.println("Adiniz :" + ad);
        System.out.println("Soyadiniz " + soyAd);
        System.out.println("Memleket : " + il);

        }
    }

