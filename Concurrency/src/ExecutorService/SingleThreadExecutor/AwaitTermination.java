package ExecutorService.SingleThreadExecutor;

import java.util.concurrent.*;

/**
 * Created by moon on 23/11/2016.
 *
 * executorService.awaitTermination(time, timeUnit)
 */
public class AwaitTermination {

    private static int counter = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            // Adding tasks
            service.submit(()-> {
                for (int i = 0; i<5000; i++) AwaitTermination.counter++;
            });

        } finally {
            if (service != null) service.shutdown();
        }

        if (service != null) {
            service.awaitTermination(1, TimeUnit.NANOSECONDS);

            if (service.isTerminated()) {
                System.out.println("All tasks finished");
            } else {
                System.out.println("At least one task is still running");
            }
        }
    }
}
