package Stream.IntermediateOperations;

import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 *
 * stream.limit(int maxSize) -> stream
 * stream.skip(int n) -> stream
 */
public class LimitAndSkipExample {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.iterate(1, n -> n+1);
        s.skip(5).limit(2).forEach(System.out::print); // 67
    }
}
