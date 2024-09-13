package milestone1.javastring.stringmethods.stringcharat;

public class CountingFrequencyCharAt {
    public static void main(String[] args) {
//        Counting Frequency of a character in a String by Using the charAt() Method
        String str = "Welcome to Java";
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);

    }
}
