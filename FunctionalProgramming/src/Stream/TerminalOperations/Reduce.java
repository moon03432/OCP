package Stream.TerminalOperations;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by moon on 28/11/2016.
 *
 * reduce(T identity, BinaryOperator<T> accumulator) -> T
 * reduce(BinaryOperator<T> accumulator) -> Optional<T>
 */
public class Reduce {

    public static void main(String[] args) {

        // How to use reduce
        Stream<String> s1 = Stream.of("w", "o", "l", "f");
        String word = s1.reduce("", (a,b) -> a+b);
        System.out.println(word);

        // String::concat is a method reference
        Stream<String> s2 = Stream.of("w", "o", "l", "f");
        word = s2.reduce("", String::concat);
        System.out.println(word);

        // Example 3: Integer multiplication
        Stream<Integer> s3 = Stream.of(3,5,6);
        System.out.println(s3.reduce(1, (a,b) -> a*b)); // 90

        // Example 4
        BinaryOperator<Integer> multiply = (a,b) -> a*b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3,5,6);

        empty.reduce(multiply).ifPresent(System.out::println);          // no output
        oneElement.reduce(multiply).ifPresent(System.out::println);     // 3
        threeElements.reduce(multiply).ifPresent(System.out::println);  // 90
    }
}
