package milestone1.javastring;

public class StringExample {
    public static void main(String[] args) {
//        1) String Literal
        String s1 = "Welcome";
        String s2 = "Welcome";//It doesn't create a new instance
//        2) By new keyword
        String s3 = new String("Welcome");//creates two objects and one reference variable

        String s4="java";//creating string by Java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String s5=new String(ch);//converting char array to string
        String s6=new String("example");//creating Java string by new keyword
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}