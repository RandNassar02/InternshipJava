package milestone1.javastring;

public class StringCompare {
    public static void main(String[] args) {
        System.out.println("----By Using equals()----");
        String s1 = "Rand";
        String s2 = "Rand";
        String s3 = new String("Rand");
        String s4 = "Randd";
        System.out.println(s1.equals(s2));//T
        System.out.println(s1.equals(s3));//T
        System.out.println(s1.equals(s4));//F
        System.out.println("---------");
        String s5 = "Rand";
        String s6 = "RAND";
        System.out.println(s5.equals(s6));//F
        System.out.println(s5.equalsIgnoreCase(s6));//T

        System.out.println("----By Using == ----");
        String s7 = "Rand";
        String s8 = "Rand";
        String s9 = new String("Rand");
        System.out.println(s7 == s8);//T (because both refer to same instance)
        System.out.println(s7 == s9);//F (because s3 refers to instance created in nonpool)
        System.out.println("----By Using compareTo() ----");
        String s10 = "Rand";
        String s11 = "Rand";
        String s12 = "Nasr";
        /*
        The first characters ‘R’ and ‘N’ are compared.
The Unicode value of ‘R’ is 82.
The Unicode value of ‘N’ is 78.
The difference is ( 82 - 78 = 4 ).
        */
        System.out.println(s10.compareTo(s11));//0
        System.out.println(s10.compareTo(s12));//4
        System.out.println(s12.compareTo(s10));//-4

    }
}
