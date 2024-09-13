package milestone3.multithreading.threadgroupcass;

public class ExampleThreadGroup2 {
    public static void main(String[] args) {
        // Create a thread group
        ThreadGroup group = new ThreadGroup("Example Group");

        // Create and start a few threads in the group
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(group, new ExampleRunnable(), "Thread-" + i);
            thread.start();
        }

        // List the threads in the group
        group.list();

        // Get the number of active threads in the group
        int activeCount = group.activeCount();
        System.out.println("Active thread count: " + activeCount);

        // Get the number of active thread groups in the group
        int activeGroupCount = group.activeGroupCount();
        System.out.println("Active thread group count: " + activeGroupCount);

        // Interrupt all threads in the group
        group.interrupt();
    }

    static class ExampleRunnable implements Runnable {
        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " is running");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }
    }
}
