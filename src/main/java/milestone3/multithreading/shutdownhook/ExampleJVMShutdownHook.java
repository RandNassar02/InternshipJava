package milestone3.multithreading.shutdownhook;

class CustomThread extends Thread{
    public void run(){
        System.out.println("JVM is shutting down.");
    }
}

public class ExampleJVMShutdownHook {
    public static void main(String[] args) throws  InterruptedException{
        try{
            // register CustomThread as shutdown hook
            Runtime.getRuntime().addShutdownHook(new CustomThread());
            // print the state of the program
            System.out.println("Program is starting...");
            // cause thread to sleep for 3 seconds
            System.out.println("Waiting for 3 seconds...");
            Thread.sleep(3000);
            // print that the program is closing
            System.out.println("Program is closing...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
