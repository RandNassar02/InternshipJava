package milestone3.newfeatures.methodreferences.staticmethod;

public class MethodReference2 {
    public static void ThreadStatus(){
        System.out.println("Thread is run");
    }

    public static void main(String[] args) {
        Thread t1 =new Thread(MethodReference2::ThreadStatus);
        t1.start();
    }
}
