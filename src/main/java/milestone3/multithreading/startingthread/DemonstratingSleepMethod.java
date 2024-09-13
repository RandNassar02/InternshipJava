package milestone3.multithreading.startingthread;

class ThreadDemo5 extends Thread {
    ThreadDemo5(String name) {
        super(name);
        System.out.println("Thread: " + name + ", " + "State:New");
    }

    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State:Running");
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }

    public void start() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Start");
        super.start();
    }
}

public class DemonstratingSleepMethod {
    public static void main(String[] args) {
        ThreadDemo5 thread1 = new ThreadDemo5("Thread-1");
        ThreadDemo5 thread2 = new ThreadDemo5("Thread-2");

        thread1.start();
        thread2.start();
    }
}
