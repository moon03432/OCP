package Synchronization.ConcurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by moon on 25/11/2016.
 */
public class MemoryConsistencyErrors {

    public static void main(String[] args) {
//        Map<String, Object> foodData = new HashMap<String, Object>();
        Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();

        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);

        // With HashMap, JVM is throwing ConcurrentModificationException at runtime
        for(String key: foodData.keySet())
            System.out.println(foodData.remove(key)); // remove action is ordered after reading keySet
    }
}
