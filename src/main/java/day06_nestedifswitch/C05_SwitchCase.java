package day06_nestedifswitch;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

       /*
* Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
* ornek
*  Kullanici  : A , B , C harflerinden birini secsin
 A'yi secmis ise, ==> Java kolay
 B'yi secmis ise, ==> Java eglenceli
 C'yi secmis ise, ==> Calismaliyim :)
*/

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen harflerden birini giriniz : \nA\tB\tC");
        char harf =input.next().toUpperCase().charAt(0);
        switch (harf){
            case 'A':
                System.out.println("Java Kolay");
                break;
            case 'B':
                System.out.println("Java Eglenceli");
                break;
            case 'C':
                System.out.println("Calismaliyim");
                break;
            default:
                System.out.println("Lütfen gecerli bir harf giriniz");

        }

        //Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
        //Ex : 568
        //Besyuzaltmissekiz

        Scanner input1=new Scanner(System.in);
        System.out.println("Lütfen pozitif 3 basamakli bir sayi giriniz...");
        int sayi = input1.nextInt();
        int birlerBas= sayi%10;
        int onlarBas=(sayi/10)%10;
        int yüzlerBas= (sayi/100);
        if(sayi>99&&sayi<1000) {
            //100 ler basamagi

            switch (yüzlerBas){

                case 1:
                    System.out.print("Yüz");
                    break;
                case 2:
                    System.out.print("Ikiyuz");
                    break;
                case 3:
                    System.out.print("Ucyuz");
                    break;
                case 4:
                    System.out.print("Dortyuz");
                    break;
                case 5:
                    System.out.print("Besyuz");
                    break;
                case 6:
                    System.out.print("Altiyuz");
                    break;
                case 7:
                    System.out.print("Yediyuz");
                    break;
                case 8:
                    System.out.print("Sekizyuz");
                    break;
                case 9:
                    System.out.print("Dokuzyuz");
                    break;
            }

            /////////10 lar basamagi

            switch (onlarBas){
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }
            switch (birlerBas){
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("üc");
                    break;
                case 4:
                    System.out.print("dört");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
            }





        }else {
            System.out.println("Lütfen 3 basamakli bir sayi giriniz");


        }



    }
}
