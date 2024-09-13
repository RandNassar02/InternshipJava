package milestone1.javastring.stringmethods.stringlength;

public class LengthExample3 {
    public static void main(String[] args) {
        String str = "Welcome To JavaTpoint";
        int size = str.length();

        System.out.println("Reverse of the string: " + "'" + str + "'" + " is");

        for (int i = 0; i < size; i++) {
            // printing in reverse order
            System.out.print(str.charAt(str.length()-i -1));
        }
    }
}
