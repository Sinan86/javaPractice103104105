package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulations {

/**
 * Length()
 * length() method'u girilen String'in uzunlugunu verir
 * butun karakterlerin adedi (bosluklar da birer karakterdir)
 */

    //havva==length=5
public static void main(String[] args) {

    String cumle ="Bugun hava yagmurlu";
    System.out.println(cumle.length());
    String str1 ="";
    System.out.println("str1 = " + str1.length());

// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    Scanner input =new Scanner(System.in);
    System.out.println("Isminizi giriniz...");
    String a=input.next();
    System.out.println("Soy isminizi giriniz");
    String b=input.next();

    String d =a.length()<=b.length()? a.length()==b.length()?"Isimler esittir":"soyismi uzundur":"Isim uzundur";

    System.out.println(d);

// Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin

    Scanner input1 =new Scanner(System.in);
    System.out.println("4 harli bir kelime yaziniz...");
    String str=input1.next();
    String g;
    String h;
    String j;
    String k;
    if(str.length()==4) {
        g = str.substring(3);
        h = str.substring(2, 3);
        j = str.substring(1, 2);
        k = str.substring(0, 1);

        System.out.print(g + h + j + k);
    }else {
        System.out.println("4 karakterli yaziniz. ");
    }

}



}
