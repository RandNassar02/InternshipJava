package milestone3.multithreading.threadpriority;

public class ExampleThreadPriority {
    public void printName(){
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Priority: " +Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ExampleThreadPriority thread =new ExampleThreadPriority();
        thread.printName();
    }
}