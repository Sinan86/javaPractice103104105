package day07_stringmanipulations;

public class C02_StringManipulationsSubstring {

    public static void main(String[] args) {


/** substring()
 //substring() in iki kullanimi vardir.
 //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
 //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
 */

//10.index dahil sonuna kadra verilen Stringi yazdiriniz
        String cumle = "Her dert Java gibi olsa";

        String a=cumle.substring(10);
        System.out.println("a = " + a);


//son 10 harfi yazdirin >>>>gibi olsa:
        String c =cumle.substring(cumle.length()-11);
        System.out.println("c = " + c);
// ilk 10 karakteri alma
        String b= cumle.substring(0,10);
        System.out.println("b = " + b);


// 11.ci karakterden sonuna kadar olan Stringi yazdiralim
        
        String d=cumle.substring(10);
        System.out.println("d = " + d);

       


    }
}
