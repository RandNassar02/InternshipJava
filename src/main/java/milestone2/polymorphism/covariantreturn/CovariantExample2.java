package milestone2.polymorphism.covariantreturn;

class A11 {
    A11 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A11");
    }
}


// A2 is the child class of A1
class A22 extends A11 {
    @Override
    A22 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A22");
    }
}

// A3 is the child class of A2
class A33 extends A22 {
    @Override
    A33 foo() {
        return this;
    }

    @Override
    void print() {
        System.out.println("Inside the class A33");
    }
}

public class CovariantExample2 {
    public static void main(String[] args) {
        A11 a11 = new A11();
        a11.foo().print();

        A22 a22 = new A22();
        a22.foo().print();

        A33 a33 = new A33();
        a33.foo().print();
    }
}
