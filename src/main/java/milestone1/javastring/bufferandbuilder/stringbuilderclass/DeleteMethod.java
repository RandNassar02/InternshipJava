package milestone1.javastring.bufferandbuilder.stringbuilderclass;

public class DeleteMethod {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.delete(1,3);
        System.out.println(sb);//prints Hlo
    }
}
