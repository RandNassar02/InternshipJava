package milestone3.multithreading.mainthread;

public class ExampleMainThread {
    public void printName(){
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        ExampleMainThread thread=new ExampleMainThread();
        thread.printName();

    }
}
