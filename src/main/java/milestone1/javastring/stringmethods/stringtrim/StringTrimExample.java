package milestone1.javastring.stringmethods.stringtrim;

public class StringTrimExample {
    public static void main(String[] args) {
        String str1 = "Hello World ";
        System.out.println(str1 + "java");
        System.out.println(str1.trim() + "java");

        String s2 = "  hello java string   ";
        System.out.println(s2.length());
        System.out.println(s2); //Without trim()

        String tr = s2.trim();
        System.out.println(tr.length());
        System.out.println(tr); //With trim()
    }
}
