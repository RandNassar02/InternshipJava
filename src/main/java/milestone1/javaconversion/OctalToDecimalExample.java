package milestone1.javaconversion;

public class OctalToDecimalExample {
    public static void main(String[] args) {
        //Declaring an octal number
        String octalString="121";
//Converting octal number into decimal
        int decimal=Integer.parseInt(octalString,8);
//Printing converted decimal number
        System.out.println(decimal);

        System.out.println(Integer.parseInt("121",8));
        System.out.println(Integer.parseInt("23",8));
        System.out.println(Integer.parseInt("10",8));
    }
}
