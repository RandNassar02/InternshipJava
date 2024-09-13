package milestone2.encapsulation.accessmodifiers;

class A {
    protected void msg() {
        System.out.println("Hello java");
    }
}

public class AccessModifiers extends A {
//    compile-time error
//    void msg() {
//        System.out.println("Hello java");
//    }
    public static void main(String[] args) {
        AccessModifiers a = new AccessModifiers();
        a.msg();
    }
}
