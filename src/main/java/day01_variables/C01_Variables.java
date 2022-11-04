package day01_variables;

public class C01_Variables {
    //PROJE OLUSTURMA===>File==>New==>Project==>Next==>Name(Buraya projenin ismini yaz kucuk harfle basla javaPractice103104105)==>finish

//PACKAGE OLUSTURMA==>java dosyasina sag click==>New==>Package==>istedigin ismi yaz kucuk harfle basla( day01_variables )

//CLASS OLUSTURMA==>olusturdugun package uzerine sag click==>New==Class==> istedigin ismi yaz buyuk harfle basla ( C01_Variables )


    /*
   Variable
     bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
     Variable icinde deger saklayan bir konteynirdir
   //bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
   //örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
   //geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
   //kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız
    */
    public static void main(String[] args) {


        //byte,short,integer,long,double,float veri tiplerinin ma ve min. degerleri?


        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " +byteMax);
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);


        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);

        int intmax = Integer.MAX_VALUE;
        System.out.println("intmax = " + intmax);
        int intmin = Integer.MIN_VALUE;
        System.out.println("intmin = " + intmin);
        
        
        long longMax = Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);
        long longmin =Long.MIN_VALUE;
        System.out.println("longmin = " + longmin);

        





    }


}
