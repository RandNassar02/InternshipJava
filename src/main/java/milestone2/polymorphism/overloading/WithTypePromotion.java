package milestone2.polymorphism.overloading;
//Method Overloading with TypePromotion
public class WithTypePromotion {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        WithTypePromotion obj = new WithTypePromotion();
        obj.sum(20, 20);
        obj.sum(20, 20, 20);
    }
}
