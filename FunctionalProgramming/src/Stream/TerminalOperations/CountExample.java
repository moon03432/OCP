package Stream.TerminalOperations;

import java.util.stream.Stream;

/**
 * Created by moon on 28/11/2016.
 *
 * stream.count() -> long
 */
public class CountExample {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s1.count());  // 3
    }
}
