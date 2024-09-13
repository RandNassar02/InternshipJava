package milestone3.reflection.newInstance;

class Simple3 {
    void message() {
        System.out.println("Hello");
    }
}

public class NewInstanceMethodExample {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("reflection.newInstance.Simple3");

            Simple3 s = (Simple3) c.newInstance();
            s.message();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
