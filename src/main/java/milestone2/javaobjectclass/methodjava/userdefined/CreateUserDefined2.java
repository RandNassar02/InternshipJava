package milestone2.javaobjectclass.methodjava.userdefined;

public class CreateUserDefined2 {
    public static void main(String[] args) {
        int a = 19;
        int b = 5;

        int c = add(a, b);   //a and b are actual parameters
        System.out.println("The sum = " + c);
    }
    //user defined method
    public static int add(int n1, int n2)   //n1 and n2 are formal parameters
    {
        int s;
        s=n1+n2;
        return s; //returning the sum
    }
}
