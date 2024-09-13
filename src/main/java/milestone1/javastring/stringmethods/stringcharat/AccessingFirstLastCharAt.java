package milestone1.javastring.stringmethods.stringcharat;

public class AccessingFirstLastCharAt {
    public static void main(String[] args) {
        String str = "Welcome to java";
        int strLength = str.length();
        System.out.println("Char at first index:"+str.charAt(0));
        System.out.println("Char at last index:"+str.charAt(strLength-1));

    }
}
