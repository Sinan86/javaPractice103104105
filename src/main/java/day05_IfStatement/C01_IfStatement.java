package day05_IfStatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {
        /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayi giriniz....");
        double x = input.nextDouble();
        System.out.println("2. sayiyi giriniz");
        double y = input.nextDouble();
        if (x>0&&y>0){
            System.out.println("sayilarin toplami = " +  (x+ y));

    } else if (x<0 && y<0 ) {
            System.out.println("sayilarin carpimi = " + x*y);
            
        } else if (x<0 && y>0 || x>0&&y<0) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else if (x*y==0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
            
        }

    }
    }
