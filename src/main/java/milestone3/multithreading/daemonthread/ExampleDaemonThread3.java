package milestone3.multithreading.daemonthread;

class ThreadDemo3 extends Thread{
    ThreadDemo3(){

    }

    public void run(){
        System.out.println("Thread "+Thread.currentThread().getName()+", is Daemon: "+Thread.currentThread().isDaemon());
    }
}
public class ExampleDaemonThread3 {
    public static void main(String[] args) {
        ThreadDemo3 thread1=new ThreadDemo3();
        ThreadDemo3 thread2=new ThreadDemo3();
        ThreadDemo3 thread3=new ThreadDemo3();

        thread1.start();
        thread2.start();
        thread3.start();

        thread3.setDaemon(true); //Exception in thread "main" java.lang.IllegalThreadStateException

    }
}
