package milestone1.javastring.stringmethods.stringcompareto;

public class CaseSensitive {
    public static void main(String[] args) {
        String s1 = new String("rand");
        String s2 = new String("RAND");
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
    }
}
