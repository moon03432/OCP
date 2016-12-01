package Synchronization.ConcurrentCollections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by moon on 25/11/2016.
 *
 * BlockingDeque methods:
 *
 * offerFirst(E e, long timeout, TimeUnit unit): add to the front of the queue
 * offerLast(E e, long timeout, TimeUnit unit): add to the tail of the queue
 * pollFirst(long timeout, TimeUnit unit): retrieve and remove from the front
 * pollLast(long timeout, TimeUnit unit): retrieve and remove from the tail
 */
public class BlockingDequeExample {

    public static void main(String[] args) {
        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));

        } catch (InterruptedException e) { // Handle interruption
        }
    }
}
