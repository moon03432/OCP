package Synchronization.ConcurrentCollections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by moon on 25/11/2016.
 *
 * HashMap with synchronized accessors
 */
public class ZooManager {

    private Map<String,Object> foodData = new HashMap<String,Object>();

    public synchronized void put(String key, String value) {
        foodData.put(key, value);
    }

    public synchronized Object get(String key) {
        return foodData.get(key);
    }
}
