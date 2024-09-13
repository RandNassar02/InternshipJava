package milestone3.multithreading.lifecycle;
class ThreadDemo3 implements Runnable {
    private Thread t;
    private String threadName;
    ThreadDemo3(String name) {
        threadName = name;
        System.out.println("Thread: " + threadName + ", " + "State: New");
    }
    public void run() {
        System.out.println("Thread: " + threadName + ", " + "State: Running");
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                System.out.println("Thread: " + threadName + ", " + "State: Waiting");
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread: " + threadName + ", " + "State: Dead");
    }

    public void start () {
        System.out.println("Thread: " + threadName + ", " + "State: Start");
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
public class ExampleThread2 {
    public static void main(String[] args) {
        ThreadDemo3 t1=new ThreadDemo3("Thread-1");
        ThreadDemo3 t2=new ThreadDemo3("Thread-2");

        t1.start();
        t2.start();
    }
}
