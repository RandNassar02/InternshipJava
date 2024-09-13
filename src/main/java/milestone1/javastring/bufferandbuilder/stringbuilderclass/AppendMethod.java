package milestone1.javastring.bufferandbuilder.stringbuilderclass;

public class AppendMethod {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java
    }
}
