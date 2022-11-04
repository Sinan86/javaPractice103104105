package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
//Fahrenheit degerini celcious a ceviren kodu yaz
// formul:c =(f-32)*5/9;

public class Q01_Variable_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz.");

        double f = input.nextDouble();
        double c =(f-32)*5/9;
        System.out.println(c);
        NumberFormat numberFormat =new DecimalFormat(".##");
        String formattedC =numberFormat.format(c);
        System.out.println("formattedc = " + formattedC+1);//Concatenation

        double doubleC= Double.valueOf(formattedC);
        System.out.println("doubleC= " + (doubleC+1));// Matematik islemi




    }
}
