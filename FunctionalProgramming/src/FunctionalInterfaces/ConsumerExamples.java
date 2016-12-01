package FunctionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by moon on 28/11/2016.
 *
 * accept(T) -> void
 */
public class ConsumerExamples {

    public static void main(String[] args) {

        // Example 1
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");

        // Example 2
        Map<String, Object> map = new HashMap<>();
        BiConsumer<String, Object> b1 = map::put;
        BiConsumer<String, Object> b2 = (k,v) -> map.put(k,v);

        b1.accept("chicken", "Cluck");
        b2.accept("chick", 1);

        System.out.println(map);
    }
}
