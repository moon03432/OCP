package Stream.IntermediateOperations;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 *
 * stream.sorted() -> stream
 * stream.sorted(Comparator) -> stream
 */
public class SortedExample {

    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("brown-", "bear-");
        s1.sorted().forEach(System.out::print); // bear-brown-
        System.out.println();

        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s2.sorted(Comparator.reverseOrder()).forEach(System.out::print);

        // Doesn't compile
//        s2.sorted(Comparator::reverseOrder);


    }
}