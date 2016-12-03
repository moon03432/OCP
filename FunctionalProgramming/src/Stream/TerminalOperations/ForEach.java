package Stream.TerminalOperations;

import java.util.stream.Stream;

/**
 * Created by moon on 28/11/2016.
 *
 * forEach(Consumer<T>) -> void
 */
public class ForEach {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::println);
    }
}
