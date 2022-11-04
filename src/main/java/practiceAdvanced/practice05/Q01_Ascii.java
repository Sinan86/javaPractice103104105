package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q01_Ascii {
    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci karakteri gir.");
        char ilk1 = input.next().charAt(0);
        System.out.println("Ikinci karakteri giriniz");
        char ikinci1 = input.next().charAt(0);

        int ilk=Math.min(ilk1,ikinci1);
        int ikinci=Math.max(ilk1,ikinci1);


        for (int i=ilk+1;i<ikinci;i++){

            System.out.println((char)+i+" ");


        }
    }

}
