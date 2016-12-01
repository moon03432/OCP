package ExecutorService.SubmitTasks.Future;

import java.util.concurrent.*;

/**
 * Created by moon on 23/11/2016.
 *
 * Future: can get result done by Thread
 */

public class GetFutureResult {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(()->41);
            System.out.println(result.get());
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
