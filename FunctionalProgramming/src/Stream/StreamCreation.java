package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by moon on 27/11/2016.
 *
 * Stream is a work pipeline, new in Java 8
 *
 * Stream can be considered as an extended collection, which can be infinite
 *
 * Creation:
 *
 * Stream.empty()
 * Stream.of()
 * Stream.generate()
 * Stream.iterate()
 * collection.stream(), collection.ParallelStream()
 *
 */
public class StreamCreation {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        // Stream can be infinite:
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n->n+2);

        // Endless loop for infinite stream
//        randoms.forEach(System.out::println);
        oddNumbers.forEach(System.out::println);

    }
}
