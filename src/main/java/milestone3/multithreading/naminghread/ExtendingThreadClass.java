package milestone3.multithreading.naminghread;
class ThreadDemo extends Thread {
    ThreadDemo( String name) {
        super(name);
        System.out.println("Thread: " + name + ", " + "State: New");
    }
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Running");
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }

    public void start () {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Start");
        super.start();
    }
}
public class ExtendingThreadClass {
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo( "Thread-1");
        ThreadDemo thread2 = new ThreadDemo( "Thread-2");
        thread1.start();
        thread2.start();
    }
}
