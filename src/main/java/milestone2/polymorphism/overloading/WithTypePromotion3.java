package milestone2.polymorphism.overloading;

//Method Overloading with Type Promotion in case of ambiguity
public class WithTypePromotion3 {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String[] args) {
        WithTypePromotion3 obj = new WithTypePromotion3();
//        Compile Time Error
//        obj.sum(20, 20);
    }
}
