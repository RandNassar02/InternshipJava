package milestone1.javastring.stringmethods.stringreplaceall;

public class NullRegularExpression {
    public static void main(String[] args) {
        String str="java";
        System.out.println(str);

        String regex = null;
        str=str.replace(regex," ");
        System.out.println(str);
    }
}
