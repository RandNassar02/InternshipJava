package milestone1.javastring.stringmethods.stringreplaceall;

public class ReplaceAllExample {
    public static void main(String[] args) {


        String s1 = "javatpoint is a very good website";
        String replaceString = s1.replaceAll("a", "e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString);

        String s2="My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString2=s2.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString2);
    }
}
