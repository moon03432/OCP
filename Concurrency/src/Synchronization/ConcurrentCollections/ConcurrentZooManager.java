package Synchronization.ConcurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by moon on 25/11/2016.
 */
public class ConcurrentZooManager {

    private Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();

    public void put(String key, String value) {
        foodData.put(key, value);
    }

    public Object get(String key) {
        return foodData.get(key);
    }
}
