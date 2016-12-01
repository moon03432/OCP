package Synchronization.ConcurrentCollections;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by moon on 25/11/2016.
 *
 * You should use a concurrent collection class anytime that you are going to have multiple threads
 * modify a collections object outside a synchronized block or method, even if you don’t expect
 * a concurrency problem.
 *
 * On the other hand, if all of the threads are accessing an established immutable or read-only collection,
 a concurrent collection class is not required.
 *
 * Class                    Interface
 * ConcurrentHashMap        ConcurrentMap
 * ConcurrentLinkedDeque    Deque
 * ConcurrentLinkedQueue    Queue
 * ConcurrentSkipListMap    ConcurrentMap, SortedMap, NavigableMap (TreeMap: sorted)
 * ConcurrentSkipListSet    SortedSet, NavigableMap (TreeSet: sorted)
 * CopyOnWriteArrayList     List
 * CopyOnWriteArraySet      Set
 * LinkedBlockingDeque      BlockingQueue, BlockingDeque
 * LinkedBlockingQueue      BlockingQueue
 */
public class ConcurrentCollectionClasses {

    public static void main(String[] args) {
        Map<String,Integer> map = new ConcurrentHashMap<>();
        map.put("zebra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant"));

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(31);
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(10);
        deque.push(4);
        System.out.println(deque.peek());
        System.out.println(deque.pop());
    }
}
