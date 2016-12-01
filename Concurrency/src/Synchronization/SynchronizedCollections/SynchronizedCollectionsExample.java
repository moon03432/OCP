package Synchronization.SynchronizedCollections;

import java.util.*;

/**
 * Created by moon on 25/11/2016.
 *
 * use synchronized collection when a non-concurrent collection already exists, just wrapping the methods
 *
 * Methods: (Collections.<method>)
 *
 * synchronizedCollection(Collection<T> c)
 * synchronizedList(List<T> list)
 * synchronizedMap(Map<K,V> m)
 * synchronizedNavigableMap(NavigableMap<K,V> m)
 * synchronizedNavigableSet(NavigableSet<T> s)
 * synchronizedSet(Set<T> s)
 * synchronizedSortedMap(SortedMap<K,V> m)
 * synchronizedSortedSet(SortedSet<T> s)
 */
public class SynchronizedCollectionsExample {

    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4,3,52)));

        synchronized (list) {
            for (int data: list)
                System.out.print(data+" ");
        }
        System.out.println();

        Map<String, Object> foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);

        // ConcurrentModificationException: synchronized collection only wrap methods, not data access
        for (String key : synchronizedFoodData.keySet())
            synchronizedFoodData.remove(key);
    }
}
