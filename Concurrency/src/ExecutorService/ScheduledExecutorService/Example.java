package ExecutorService.ScheduledExecutorService;

import java.util.concurrent.*;

/**
 * Created by moon on 23/11/2016.
 */
public class Example {

    public static void main(String[] args) {
        ScheduledExecutorService service = null;

        try {
            service = Executors.newSingleThreadScheduledExecutor();

            System.out.println("begin");

            Runnable task1 = () -> System.out.println("task 1");
            Callable<String> task2 = () -> {
                System.out.println("task 2");
                return "task 2";
            };
            Runnable task3 = () -> System.out.println("task 3");

            Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
            Future<?> result2 = service.schedule(task2, 8, TimeUnit.SECONDS);

            service.scheduleAtFixedRate(task3,5,3,TimeUnit.SECONDS);
//            service.scheduleWithFixedDelay(task1,0,2,TimeUnit.MINUTES);

            System.out.println("end");

        } finally {
            if (service != null) {
//                service.shutdown();
            }
        }
    }
}
