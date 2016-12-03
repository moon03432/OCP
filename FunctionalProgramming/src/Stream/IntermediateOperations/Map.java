package Stream.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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
public class Map {

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

        // Exercise
        Stream<String> stream = Stream.of("a", "ab", "abc");
//        System.out.println(stream.reduce((a,b) -> a + b).map(c -> c.length()));
        System.out.println(stream.map(String::length).reduce((b, c) -> b + c));



    }
}
