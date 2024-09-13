package milestone3.multithreading.threadgroupcass;

public class ExampleThreadGroup implements Runnable{
    public static void main(String[] args) {
        ExampleThreadGroup tg=new ExampleThreadGroup();
        tg.func();
    }
    public void func() {
        try {
            // create a parent ThreadGroup
            ThreadGroup pGroup = new ThreadGroup("Parent ThreadGroup");

            // create a child ThreadGroup for parent ThreadGroup
            ThreadGroup cGroup = new ThreadGroup(pGroup, "Child ThreadGroup");

            // create a thread
            Thread t1 = new Thread(pGroup, this);
            System.out.println("Starting " + t1.getName() + "...");

            // create another thread
            Thread t2 = new Thread(cGroup, this);
            System.out.println("Starting " + t2.getName() + "...");

            t1.start();
            t2.start();

            // display the number of active threads
            System.out.println("Active threads in \"" + pGroup.getName() + "\" = " + pGroup.activeCount());

            // block until the other threads finish
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }

    // implements run()
    public void run() {

        for(int i = 0;i < 1000;i++) {
            i++;
        }
        System.out.println(Thread.currentThread().getName() + " finished executing.");
    }
}
