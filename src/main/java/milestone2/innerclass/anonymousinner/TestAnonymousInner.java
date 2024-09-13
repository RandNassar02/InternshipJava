package milestone2.innerclass.anonymousinner;

abstract class Person {
    abstract void eat();
}

public class TestAnonymousInner {
    public static void main(String[] args) {
//        Internal working of given code
        Person p = new Person() {
            void eat() {
                System.out.println("eat");
            }
        };
        p.eat();
    }
}
