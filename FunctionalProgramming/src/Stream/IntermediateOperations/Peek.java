package Stream.IntermediateOperations;

import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 *
 * stream.peek(Consumer action) -> stream
 *
 * peek() doesn't change the stream, but do something on the stream
 */
public class Peek {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");

        long count = stream.filter(s -> s.startsWith("b")).peek(System.out::println).count();
        System.out.println(count);
    }
}
