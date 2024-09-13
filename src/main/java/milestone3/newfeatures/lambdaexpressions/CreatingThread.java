package milestone3.newfeatures.lambdaexpressions;

public class CreatingThread {
    public static void main(String[] args) {
        //Thread Example without lambda
        Runnable r1=new Runnable() {
            public void run() {
                System.out.println("Thread 1 is run");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();



        //Thread Example with lambda

        Runnable r2=()->{
            System.out.println("Thread 2 is run");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
