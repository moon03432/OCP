package ExecutorService.ThreadPool;

import java.util.concurrent.*;

/**
 * Created by moon on 24/11/2016.
 *
 * newScheduledThreadPool(int nbThreads) -> ScheduledExecutorService
 */
public class ScheduledThreadPoolExample {

    public static void main(String[] args) {
        ScheduledExecutorService service = null;

        try {
            service = Executors.newScheduledThreadPool(4);

            System.out.println("begin");

            Runnable task1 = () -> System.out.println("task 1");
            Runnable task2 = () -> System.out.println("task 2");
            Runnable task3 = () -> System.out.println("task 3");
            Callable<String> task4 = () -> "Monkey";

            Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
//            Future<?> result2 = service.schedule(task4, 8, TimeUnit.MINUTES);

            service.scheduleAtFixedRate(task2,5,3,TimeUnit.SECONDS);
            service.scheduleWithFixedDelay(task3,5,3,TimeUnit.SECONDS);

            System.out.println("end");

        } finally {
            if (service != null) {
//                service.shutdown();
            }
        }
    }
}
