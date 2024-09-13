package milestone1.javaconversion;
class Emp{}
public class ObjectToStringExample {
    public static void main(String[] args) {

//        Converting User-defined class
        Emp e=new Emp();
        String s=e.toString();
        String s1=String.valueOf(e);
        System.out.println(s);
        System.out.println(s1);

//        Converting StringBuilder
        String s2="hello";
        StringBuilder sb=new StringBuilder(s2);
        sb.reverse();
        String rev=sb.toString();//converting StringBuilder to String
        System.out.println("String is: "+s2);
        System.out.println("Reverse String is: "+rev);
//        check the palindrome string
        String s3="nitin";
        StringBuilder sb3=new StringBuilder(s3);
        sb3.reverse();
        String rev3=sb3.toString();//converting StringBuilder to String
        if(s3.equals(rev3)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome String");
        }
    }
}
