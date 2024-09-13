package milestone1.javastring.stringmethods.stringreplaceall;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s1="My name is Rand. My name is Rand. My name is Rand.";
        String replaceString=s1.replaceAll("\\s","");
        System.out.println(replaceString);
    }
}
