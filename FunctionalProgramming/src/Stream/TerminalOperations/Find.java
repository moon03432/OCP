package Stream.TerminalOperations;

import java.util.stream.Stream;

/**
 * Created by moon on 28/11/2016.
 *
 * stream.findAny() -> Optional<T>
 * stream.findFirst() -> Optional<T>
 */
public class Find {

    public static void main(String[] args) {

        // findAny, findFirst
        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s3.findAny().ifPresent(System.out::println);        // monkey
        infinite.findAny().ifPresent(System.out::println);  // chimp
    }
}
