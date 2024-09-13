package milestone2.javaobjectclass.methodjava.instance;

public class InstanceMethodExample {
    public static void main(String[] args) {
        InstanceMethodExample obj = new InstanceMethodExample();
        System.out.println("The sum =" + obj.add(12, 13));
    }

    int s;

    public int add(int a, int b) {
        s = a + b;
        return s;
    }
}

