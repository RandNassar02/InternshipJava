package milestone1.javatutorial.operators.logical;

public class AND {
    public static void main(String[] args){
        int a=10;
        int b=5;
        int c=20;

        System.out.println(a<b && a<c); //F&&T=F
        System.out.println(a>b & a<c); //T&T=T

        System.out.println(a<b && a++<c);
        System.out.println(a); // 10 Not Checked

        System.out.println(a<b & a++<c);
        System.out.println(a); // 11 Checked


        System.out.println(test1() && a<c); //F&&T=F
    }

    private static boolean test1() {
        System.out.println("Test1");
        return false;
    }

    private static boolean test2() {
        System.out.println("Test2");
        return false;
    }
}
