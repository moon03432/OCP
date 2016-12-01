package Stream.PrimitiveStreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 */
public class Intro {

    public static void main(String[] args) {

        // Example 1: IntStream
        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.mapToInt(x -> x).sum());

        IntStream intStream = IntStream.of(1,2,3);
//        IntStream intStream = IntStream.empty();
        OptionalDouble avg = intStream.average();
        System.out.println(avg);
    }
}
