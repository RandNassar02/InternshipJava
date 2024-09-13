package milestone1.javaconversion;

public class HexToDecimalExample {
    public static void main(String[] args) {
        String hex="a";
        int decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);

        System.out.println(Integer.parseInt("a",16));
        System.out.println(Integer.parseInt("f",16));
        System.out.println(Integer.parseInt("121",16));
    }
}
