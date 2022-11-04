package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q02_For_Countinue {

        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int sum=0;
        for (int i=0; i<5;i++){
            System.out.println("Bir sayi giriniz...");
            int sayi =input.nextInt();
            if(sayi<10&&sayi>5){
                continue;
            }else {
                sum=sum+sayi;//sum+=sayi
            }
        }
        System.out.println(sum);


    }
}
