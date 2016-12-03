package Stream.IntermediateOperations;

import java.util.stream.Stream;

/**
 * Created by moon on 29/11/2016.
 *
 * stream.distinct() -> stream
 */
public class Distinct {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("duck", "duck", "goose");
        s.distinct().forEach(System.out::print);    // duckgoose
    }
}
