package ExecutorService.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by moon on 24/11/2016.
 *
 * newCachedThreadPool() -> ExecutorService: unlimited size, for executing many short-lived asynchronous tasks
 * newFixedThreadPool(int) -> ExecutorService: limited size
 */
public class ThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
//            service = Executors.newCachedThreadPool();
            service = Executors.newFixedThreadPool(4);

            System.out.println("begin");

            service.submit(()-> System.out.println("pringting zoo inventory"));

            service.submit(() -> {
                for(int i=0; i<30; i++)
                    System.out.println("Printing record: "+i);
            });

            service.submit(() -> {
                for(int i=0; i<30; i++)
                    System.out.println("Printing record: "+i);
            });

            service.submit(() -> System.out.println("Printing zoo inventory"));

            System.out.println("end");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
