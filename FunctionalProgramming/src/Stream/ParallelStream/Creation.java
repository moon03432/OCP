package Stream.ParallelStream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 */
public class Creation {

    public static void main(String[] args) {
        // Example 1: stream.parallel()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> parallelStream = stream.parallel();

        // Example 2: collection.parallelStream()
        Stream<Integer> ps2 = Arrays.asList(1,2,3).parallelStream();
    }
}
