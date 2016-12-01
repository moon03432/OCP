package Synchronization.ConcurrentCollections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by moon on 25/11/2016.
 *
 * BlockingQueue methods:
 *
 * offer(E e, long timeout, TimeUnit unit): add item to the queue with a timeout
 * poll(long timeout, TimeUnit unit): retrieve and remove an item from queue with a timeout, return null if timeout
 */
public class BlockingQueueExample {

    public static void main(String[] args) {
        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) { // Handle interruption
        }
    }
}
