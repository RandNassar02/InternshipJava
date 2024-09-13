package milestone2.innerclass.anonymousinner;

interface Eatable {
    void eat();
}

public class UsingInterface {
    public static void main(String[] args) {
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("eat");
            }
        };
        e.eat();
    }
}
