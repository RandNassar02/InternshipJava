package milestone2.exceptionhandling;

public class CommonScenarios {
    public static void main(String[] args) {

        int a=50/0;//ArithmeticException
        System.out.println(a);

        String b=null;
        System.out.println(b.length());//NullPointerException

        String c="abc";
        int i=Integer.parseInt(c);//NumberFormatException

        int d[]=new int[5];
        d[10]=50; //ArrayIndexOutOfBoundsException
    }
}
