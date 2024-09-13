package milestone2.polymorphism.overloading;
//Method Overloading with Type Promotion if matching found

public class WithTypePromotion2 {
    void sum(int a,int b){
        System.out.println("int");
    }
    void sum(long a,long b){
        System.out.println("long");
    }

    public static void main(String[] args) {
        WithTypePromotion2 obj = new WithTypePromotion2();
        obj.sum(20,20);
    }
}
