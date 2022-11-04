package day07_stringmanipulations;

public class C09_StringManipulations {

/*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/







    public static void main(String[] args) {



//Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37

    int num =223878;
    String a=String.valueOf(num);
    String t="";

for(int i=0;i<a.length();i++){
    String c=a.substring(i,i+1);
    if(a.indexOf(c)==a.lastIndexOf(c)){
        t=t+c;

    }

}System.out.println(t);




    }


}
