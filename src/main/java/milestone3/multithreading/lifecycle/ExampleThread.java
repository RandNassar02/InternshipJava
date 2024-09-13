package milestone3.multithreading.lifecycle;
class ThreadDemo2 extends Thread {
    private Thread t;
    private String threadName;
    ThreadDemo2(String name) {
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
public class ExampleThread {
    public static void main(String[] args) {
        ThreadDemo2 t1=new ThreadDemo2("Thread-1");
        ThreadDemo2 t2=new ThreadDemo2("Thread-2");

        t1.start();
        t2.start();
    }
}
