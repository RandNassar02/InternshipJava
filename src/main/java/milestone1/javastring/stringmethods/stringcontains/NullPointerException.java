package milestone1.javastring.stringmethods.stringcontains;

public class NullPointerException {
    public static void main(String[] args) {
        String str ="welcome to java";
        if(str.contains(null)){
            System.out.println("if block");
        }
        else {
            System.out.println("else");
        }
    }
}
