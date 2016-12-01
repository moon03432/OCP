package Synchronization;

import java.util.concurrent.*;

/**
 * Created by moon on 24/11/2016.
 *
 * Problem: sheepCount is shared by threads, when two threads are simultaneously accessing it,
 * one thread's operation could be lost
 */
public class SheepManager {

    // This variable is shared by threads and not thread-safe
    private int sheepCount = 0;

    private void incrementAndReport() {
        System.out.print((++sheepCount)+" ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();

            for(int i = 0; i<10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
