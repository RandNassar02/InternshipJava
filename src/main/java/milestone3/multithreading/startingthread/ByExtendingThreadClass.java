package milestone3.multithreading.startingthread;
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
public class ByExtendingThreadClass {
    public static void main(String[] args) {
        ThreadDemo threadDemo1=new ThreadDemo("Thread-1");
        ThreadDemo threadDemo2=new ThreadDemo("Thread-2");
        ThreadDemo threadDemo3=new ThreadDemo("Thread-3");

        threadDemo1.start();
        threadDemo2.start();
        threadDemo3.start();

    }
}
