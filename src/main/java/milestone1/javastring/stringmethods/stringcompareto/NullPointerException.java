package milestone1.javastring.stringmethods.stringcompareto;

public class NullPointerException {
    public static void main(String[] args) {
        String str=null;
        int no= str.compareTo("rand");
        System.out.println(no);
    }
}
