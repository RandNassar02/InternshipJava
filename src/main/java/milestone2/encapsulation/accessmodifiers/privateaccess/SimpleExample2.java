package milestone2.encapsulation.accessmodifiers.privateaccess;

class A2 {
    private A2() {
    }//private constructor

    void msg() {
        System.out.println("Hello java");
    }
}

public class SimpleExample2 {
     public static void main(String[] args) {
         //Compile Time Error
//         A2 obj = new A2();
     }
}
