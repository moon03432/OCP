package Stream.TerminalOperations;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by moon on 28/11/2016.
 *
 * stream.min(lambda) -> Optional<T>
 */
public class MinExample {

    public static void main(String[] args) {

        Stream<String> s2 = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s2.min((a, b) -> a.length() - b.length());
        min.ifPresent(System.out::println);

        // empty stream
        Optional<?> minEmpty = Stream.empty().min((a,b) -> 0);
        System.out.println(minEmpty.isPresent());   // false
    }
}
