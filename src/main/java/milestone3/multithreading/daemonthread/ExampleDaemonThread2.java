package milestone3.multithreading.daemonthread;

class ThreadDemo2 extends Thread{
    ThreadDemo2(){

    }

    public void run(){
        System.out.println("Thread "+Thread.currentThread().getName()+", is Daemon: "+Thread.currentThread().isDaemon());
    }
}
public class ExampleDaemonThread2 {
    public static void main(String[] args) {
        ThreadDemo2 thread1=new ThreadDemo2();
        ThreadDemo2 thread2=new ThreadDemo2();
        ThreadDemo2 thread3=new ThreadDemo2();

        thread3.setDaemon(true);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
