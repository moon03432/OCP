package ExecutorService.SubmitTasks.Future;

import java.util.concurrent.*;

/**
 * Created by moon on 23/11/2016.
 *
 * future.get(time, timeUnit)
 */
public class GetFutureResultWithTimeout {

    private static int counter = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(()-> {
                for (int i = 0; i<500; i++) GetFutureResultWithTimeout.counter++;
            });

            result.get(9, TimeUnit.MICROSECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
