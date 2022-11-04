package day07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {

    public static void main(String[] args) {

        String str1="Hi";
        System.out.println(str1.isEmpty());

        String str2 ="";
        System.out.println(str2.isEmpty());
        String str3 =" ";
        System.out.println(str3.isEmpty());


        //// Kullanicidan alacaginiz bir stringin  bos olup olmadigini kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Veri giriniz");
        String a =input.next();
        if (a.isEmpty()){
            System.out.println("bos");
        }else {
            System.out.println("Dolu");
        }


    }


}
