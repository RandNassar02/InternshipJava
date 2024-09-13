package milestone1.javastring.stringmethods.stringsubstring;

public class SubstringExample {
    public static void main(String[] args) {
        String str = "Javatpoint";
        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(2));


        String substr = str.substring(0); // Starts with 0 and goes to end
        System.out.println(substr);
        String substr2 = str.substring(5, 10); // Starts from 5 and goes to 10
        System.out.println(substr2);
//        String substr3 = str.substring(5,15);// Returns Exception
    }
}
