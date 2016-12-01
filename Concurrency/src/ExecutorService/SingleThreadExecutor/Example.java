package ExecutorService.SingleThreadExecutor;

import java.util.concurrent.*;

/**
 * Created by moon on 24/11/2016.
 *
 * Create SingleThreadExecutor instance and execute tasks by lambda expression
 */
public class Example {

    // main() is an independent thread from ExecuterService
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor(); // Threads are executed one by one, preserving the order

            System.out.println("begin");

            service.execute(()-> System.out.println("pringting zoo inventory"));

            service.execute(() -> {
                for(int i=0; i<3; i++)
                    System.out.println("Printing record: "+i);
            });

            service.execute(() -> System.out.println("Printing zoo inventory"));

            System.out.println("end");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //
            }

            System.out.println(service.isShutdown());
            System.out.println(service.isTerminated());
        } finally {
            if (service != null) {
                // Important: otherwise the application will not terminate
                // ExecuterService will be terminated once all threads are finished
                // shutdownNow() will terminate immediately and abort all running tasks
                service.shutdown();
            }
        }
    }
}
