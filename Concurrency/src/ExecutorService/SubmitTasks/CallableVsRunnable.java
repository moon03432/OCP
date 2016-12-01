package ExecutorService.SubmitTasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by moon on 23/11/2016.
 *
 * submit(Callable) -> Future<V>
 * submit(Runnable)
 *
 * Callable: can return value, throw exception
 * Runable: cannot return value, cannot throw exception
 */
public class CallableVsRunnable {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            service.submit(()->{Thread.sleep(1000); return null;}); // lambda as Callable
//            service.submit(()->{Thread.sleep(1000);}); // lambda as Runnable, cannot throw Exception
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
