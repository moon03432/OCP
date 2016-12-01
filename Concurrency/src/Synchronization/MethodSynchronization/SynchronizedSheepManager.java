package Synchronization.MethodSynchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by moon on 24/11/2016.
 *
 * synchronized keyword
 * <=>
 * synchronized blocks allow only one thread to pass
 *
 * static synchronized: one thread access across all instances
 */
public class SynchronizedSheepManager {

    private int sheepCount = 0;

    private synchronized void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }

    /* synchronized keyword is equivalent to:

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }

    */

    public static synchronized void printDaysWork() {
        System.out.print("Finished work");
    }

    /* equivalent to :

    public static synchronized void printDaysWork() {
        synchronized(SheepManager.class) {
            System.out.print("Finished work");
        }
    }

    one thread access across all instances
     */

    public static void main(String[] args) { ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SynchronizedSheepManager manager = new SynchronizedSheepManager();

            for(int i = 0; i<10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
