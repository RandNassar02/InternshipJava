package milestone1.javastring.stringmethods.stringcontains;

public class ContainsExample2 {
    public static void main(String[] args) {
        String str = "To learn java visit Javatpoint.com";
        if (str.contains("Javatpoint.com")) {
            System.out.println("This string contains");
        } else
            System.out.println("This string is not contains");
    }
}
