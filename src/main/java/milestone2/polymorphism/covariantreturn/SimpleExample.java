package milestone2.polymorphism.covariantreturn;

class A {
    A get() {
        return this;
    }
}

public class SimpleExample extends A {
    SimpleExample get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type");
    }

    public static void main(String[] args) {
        new SimpleExample().get().message();
    }
}
