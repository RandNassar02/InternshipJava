package milestone3.multithreading.schedulingthreads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExampleSchedule2 {
    public static void main(String[] args) {
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final ScheduledFuture<?> beepHandler =
                scheduler.schedule(new BeepTask(), 2, TimeUnit.SECONDS);

        scheduler.schedule(new Runnable() {

            @Override
            public void run() {
                beepHandler.cancel(true);
                scheduler.shutdown();
            }
        }, 10, TimeUnit.SECONDS);
    }

    static class BeepTask implements Runnable {

        public void run() {
            System.out.println("beep");
        }
    }
}
