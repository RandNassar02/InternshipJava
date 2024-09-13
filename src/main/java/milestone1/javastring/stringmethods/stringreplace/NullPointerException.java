package milestone1.javastring.stringmethods.stringreplace;

public class NullPointerException {
    public static void main(String[] args) {
        String str="For learning java";
        int size=str.length();

        System.out.println(str);
        String taeget=null;
        str =str.replace(taeget,"java");
        System.out.println(str);
    }
}
