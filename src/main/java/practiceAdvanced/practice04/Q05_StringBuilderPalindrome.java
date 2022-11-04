package practiceAdvanced.practice04;

public class Q05_StringBuilderPalindrome {
    public static void main(String[] args) {

       // Bir string degerini Polindrome olup olmadigini kont. eden kod yaziniz.


        String str ="nazan";
        String strReverse="";
        for (int i =str.length()-1;i>-1;i--){
            strReverse+= str.charAt(i);

        }
        System.out.println(strReverse);
        if(str.equalsIgnoreCase(strReverse)){
            System.out.println("Polindrome");
        }else {
            System.out.println("Polindrome degil");
        }
        String str1 ="nazan";
        StringBuilder stb= new StringBuilder(str1);
        String  stbreverse=stb.toString();
        System.out.println(stb);
        System.out.println(stbreverse);
        if(str.equalsIgnoreCase(stbreverse)){
            System.out.println("Polindrome");
        }else {
            System.out.println("Polindrome Degil");
        }
    }
}
