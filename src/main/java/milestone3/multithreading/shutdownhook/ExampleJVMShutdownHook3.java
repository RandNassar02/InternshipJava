package milestone3.multithreading.shutdownhook;

class CustomThread3 implements Runnable {
    public void run() {
        System.out.println("JVM is shutting down.");
    }
}
public class ExampleJVMShutdownHook3 {
    public static void main(String[] args) {
        try {
            Thread hook = new Thread(new CustomThread3());
            // register Message as shutdown hook
            Runtime.getRuntime().addShutdownHook(hook);
            // print the state of the program
            System.out.println("Program is starting...");
            // cause thread to sleep for 3 seconds
            System.out.println("Waiting for 3 seconds...");
            Thread.sleep(3000);
            // print that the program is closing
            System.out.println("Program is closing...");
            Runtime.getRuntime().removeShutdownHook(hook);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
