package Stream.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 *
 * Stream<T> s;
 * Function mapper: T -> R
 * s.map(mapper) -> Stream<R>
 *
 * flatMap: Stream<Stream> -> Stream
 */
public class MapExample {

    public static void main(String[] args) {

        // map
        Stream<String> s = Stream.of("a", "ab", "abc");
        s.map(String::length).forEach(System.out::print); // 123
        System.out.println();

        // flatMap
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(l -> l.stream()).forEach(System.out::println);
    }
}
