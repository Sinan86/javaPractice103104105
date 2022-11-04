package day05_IfStatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {

//Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 2 sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a>b) {
            System.out.println(b);
        } else if (b>a) {
            System.out.println(a);

        }
    else {
            System.out.println("Sayilar birbirine esit...");
        }



    }
}
