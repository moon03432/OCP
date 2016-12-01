package Synchronization.ConcurrentCollections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by moon on 25/11/2016.
 *
 * CopyOnWrite classes will create a new object every time the collection is modified, while the reference stays same
 * They can use a lot of memory and are commonly used in multi-threaded environment with lots of reads and few writes
 */
public class CopyOnWriteCollectionsExample {
    public static void main(String[] args) {

        // If uses an ArrayList object, ConcurrentModificationException will be raised
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));

        for (Integer item: list) {
            System.out.print(item+" ");
            list.add(9);
        }

        System.out.println();
        System.out.println("Size: " + list.size());
    }
}
