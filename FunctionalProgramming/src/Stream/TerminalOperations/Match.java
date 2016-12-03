package Stream.TerminalOperations;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by moon on 28/11/2016.
 *
 * stream.allMatch(Predicate) -> boolean
 * stream.anyMatch(Predicate) -> boolean
 * stream.noneMatch(Predicate) -> boolean
 */
public class Match {

    private enum Color {
        RED,BLUE,YELLOW;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));   // true
        System.out.println(list.stream().allMatch(pred));   // false
        System.out.println(list.stream().noneMatch(pred));   // false
        System.out.println(infinite.anyMatch(pred));   // true

        // Vivi's exercise
        List<Object> l = Arrays.asList(Color.BLUE, Color.RED, Color.YELLOW);
        Predicate<Object> color = x -> x instanceof Color;

        System.out.println(l.stream().anyMatch(color));   // true
        System.out.println(l.stream().allMatch(color));   // false
        System.out.println(l.stream().noneMatch(color));   // false
    }
}
