package milestone1.javastring.stringmethods.stringreplace;

public class ReplaceExample {
    public static void main(String[] args) {
        String str = "This very good website";
        String replaceString =str.replace('o','t');//replaces all occurrences of 'o' to 't'
        System.out.println(replaceString);

        String str2 = "my name is Rand my is";
        String replaceString2 =str2.replace("is","was");//replaces all occurrences of 'is' to 'was'

        String str3 = "ooooo-hhhh-ooooo";
        String replaceString3 =str3.replace("h","s");
        System.out.println(replaceString3);
        replaceString3=str3.replace("s","h");
        System.out.println(replaceString3);
    }
}
