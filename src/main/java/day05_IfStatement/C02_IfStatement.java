package day05_IfStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        // Kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner input =new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas= input.nextInt();
        if (yas>64) {
            System.out.println("Emekli olabilirsin...");
        }else {
            System.out.println(65-yas + "sene kadar daha clistiktan sonra Emekli olabilirsin...");
        }

    }
}