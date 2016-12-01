package Stream.IntermediateOperations;

import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 *
 * stream.filter(Predicate) -> stream
 */
public class FilterExample {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::print);    // monkey
    }
}
