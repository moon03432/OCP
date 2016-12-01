package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 *
 * Stream is lazy evaluated
 */
public class StreamPipeline {

    public static void main(String[] args) {

        // Example 1: filter length = 4
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream().filter(s -> s.length() == 4).sorted().forEach(System.out::println);

        // Example 2: infinite stream
//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .sorted().limit(2)
//                .forEach(System.out::println); // endless
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println); // ok
//        Stream.generate(() -> "Lazisson")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println); // endless

        // Example 3: peek on infinite stream
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(3)
                .forEach(System.out::print); // 113355
        System.out.println();

        // Example 4: Stream is lazy evalutated
        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        Stream<String> stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count()); // 3
    }
}
