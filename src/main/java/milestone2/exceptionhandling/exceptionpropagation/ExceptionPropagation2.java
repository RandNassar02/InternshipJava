package milestone2.exceptionhandling.exceptionpropagation;

public class ExceptionPropagation2 {
    void m2() {
//        Compile Time Error
//        throw new java.io.IOException("device error");//checked exception
    }

    void n2() {
        m2();
    }

    void p2() {
        try {
            n2();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    public static void main(String args[]) {
        ExceptionPropagation2 obj = new ExceptionPropagation2();
        obj.p2();
        System.out.println("normal flow");
    }
}
