package milestone1.javastring;

public class ImmutableString {
    public static void main(String[] args) {
        String s = "Rand";
        s.concat("Nassar"); //concat() method appends the string at the end
        System.out.println(s); // strings are immutable objects will print Rand

        System.out.println("----------");

        String s1 = "Rand";
        s1=s1.concat("Nassar");
        System.out.println(s1);

    }
}
