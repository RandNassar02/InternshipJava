package milestone1.javastring.stringmethods.stringconcat;

public class ConcatExample {
    public static void main(String[] args) {
        String str1 = "Hello World";
        // The string s1 does not get changed
        str1.concat(" in java");
        System.out.println(str1);
        str1=str1.concat(" in java");
        System.out.println(str1);

        String str2 = "Hello";
        String str3 = "World";
        String str4 = "in java";
        // Concatenating one string
        String str5 = str2.concat(str3);
        System.out.println(str5);
        // Concatenating multiple strings
        String str6 = str2.concat(str3).concat(str4);
        System.out.println(str6);
        String str7 = str2.concat("@").concat(str3);
        System.out.println(str7);

        String str8 = "Country";
        String str9 = "Jo is my ".concat(str8);
        System.out.println(str9);
    }
}
