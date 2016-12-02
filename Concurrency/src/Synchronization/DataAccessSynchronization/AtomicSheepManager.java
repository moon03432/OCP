package Synchronization.DataAccessSynchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by moon on 24/11/2016.
 *
 * Solution: set the counter as AtomicInteger, so that only one thread can access it one time
 *
 * Atomic classes:
 * AtomicBoolean, AtomicInteger, AtomicIntegerArray, AtomicLong, AtomicLongArray, AtomicReference, AtomicReferenceArray
 *
 * Atomic methods:
 * get(), set(), getAndSet(), incrementAndGet(), getAndIncrement(), decrementAndGet(), getAndDecrement()
 */
public class AtomicSheepManager {

    private AtomicInteger sheepCount = new AtomicInteger(0);

    private void incrementAndReport() {
        System.out.print(sheepCount.incrementAndGet()+" ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            AtomicSheepManager manager = new AtomicSheepManager();

            for(int i = 0; i<10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
