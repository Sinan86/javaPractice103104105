package day05_IfStatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {

      //  Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        //// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        //// Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
        //// Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        //// Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("Dort basamakli bir sayi giriniz...");
        double a = input.nextDouble();
        if(a<1000 || a>9999){
            System.out.println("Lütfen dörtbasamakli bir sayi giriniz...");


        } else if (a%5==0) {
            if (a%10==0){
                System.out.println("5 e bolunebilen cift sayi...");
            } else if (a%10!=0) {
                System.out.println("5 e bolünebilen tek sayi...");

            }

        }else {
            System.out.println("Tekrar deneyin...");
        }


    }

}
