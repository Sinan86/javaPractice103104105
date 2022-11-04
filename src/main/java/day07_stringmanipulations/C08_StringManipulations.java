package day07_stringmanipulations;

import java.util.Scanner;

public class C08_StringManipulations {

    //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Email adrsinizi giriniz");
        String str =input.next();
        String arananMetin="@gmail.com";
        if(!str.contains(arananMetin)){
            System.out.println("Lutfen gmail adresinizi girin...");
        } else if (str.endsWith(arananMetin)) {
            System.out.println("Dogru");

        }else {
            System.out.println("lütfen yazimi kontrol ediniz.");
        }
    }
}
