package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {
/*
        Q04_IfStatement_DikUcgen

        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.


 */

        Scanner input =new Scanner(System.in);
        System.out.println("Birinci kenari giriniz...");
        int birinciKenar =input.nextInt();

        System.out.println("ikinci kenari giriniz...");
        int ikinciKenar =input.nextInt();

        System.out.println("ücuncu kenari giriniz...");
        int ücüncüKenar =input.nextInt();

        if(birinciKenar*birinciKenar+ikinciKenar*ikinciKenar==ücüncüKenar*ücüncüKenar) {

            System.out.println("Bu bir dik ucgendir");


        } else if (birinciKenar*birinciKenar+ücüncüKenar*ücüncüKenar==ikinciKenar*ikinciKenar) {

            System.out.println("Bu bir dik ucgendir");

        } else if (ücüncüKenar*ücüncüKenar+ikinciKenar*ikinciKenar==birinciKenar*birinciKenar) {
            System.out.println("Bu bir dik ucgendir");
        }else
            System.out.println("Bu bir dik ucgen degildir");
    }



}
