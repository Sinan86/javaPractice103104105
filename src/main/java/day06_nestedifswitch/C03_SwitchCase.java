package day06_nestedifswitch;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

       /* DERS PROGRAMI

        Hangi gun hangi dersin oldugunu gosteren bir program yaziniz

        Pazartesi ve Sali ise: Java

        Persembe ve Cuma ise: Selenyum

        Carsamba ve Cumartesi ise: SQL

        aksi halde: izin gunu=Day Off


        */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz...");
        String gun = input.next().toUpperCase();

        switch (gun){

            case "PAZARTESI":
            case "SALI":
                System.out.println("Java");
                break;
            case "PERSEMBE":
            case "CUMA":
                System.out.println("Selenyum");
                break;
            case "CARSAMBA":
            case "CUMARTESI":
                System.out.println("SQL");
                break;
            default:
                System.out.println("DAY OFF");






        }




    }
}