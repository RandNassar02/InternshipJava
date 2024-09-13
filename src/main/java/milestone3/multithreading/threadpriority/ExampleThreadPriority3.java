package milestone3.multithreading.threadpriority;
class ThreadDemo2 extends Thread {
    ThreadDemo2( ) {
    }
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName()
                + ", Thread Priority: " +Thread.currentThread().getPriority());
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void start () {
        super.start();
    }
}
public class ExampleThreadPriority3 {
    public static void main(String[] args) {
        ThreadDemo2 thread1=new ThreadDemo2();
        ThreadDemo2 thread2=new ThreadDemo2();
        ThreadDemo2 thread3=new ThreadDemo2();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
