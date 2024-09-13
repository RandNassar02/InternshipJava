package milestone3.multithreading.creatingthread;
class ThreadDemo2 extends Thread {
    ThreadDemo2(String name) {
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
public class ByExtendingThreadClass {
    public static void main(String[] args) {
        ThreadDemo2 thread1 = new ThreadDemo2( "Thread-1");
        ThreadDemo2 thread2 = new ThreadDemo2( "Thread-2");
        thread1.start();
        thread2.start();
    }
}
