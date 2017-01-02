package Stream.TerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by moon on 28/11/2016.
 *
 * <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
 * <R,A> R collect(Collector<? super T, A,R> collector)
 *
 * combiner is used for parallel streams, combining results of multiple threads
 */
public class Collect {

    public static void main(String[] args) {

        // Example 1
        Stream<String> s1 = Stream.of("w", "o", "l", "f");
        StringBuilder word = s1.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);   // wolf

        // Example 2: TreeSet is sorted
        // TreeSet::add applies to an element, meanwhile TreeSet::addAll applies to a collection
        Stream<String> s2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = s2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set);    // [f,l,o,w]

        // Example 3: Built-in collectors
        // Set doesn't have order
        Stream<String> s3 = Stream.of("w", "o", "l", "f");
        Set<String> set3 = s3.collect(Collectors.toSet());
        System.out.println(set3); // [f, w, l, o]

        Stream<String> s4 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set4 = s4.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set4); // [f, l, o, w]

        // Review Question 16: Collectors partitioningBy & groupingBy
        Stream<String> s5 = Stream.of("a", "c");
        Stream<String> s6 = Stream.of("a", "c");

        Map<Boolean, List<String>> p = s5.collect(Collectors.partitioningBy(b->b.startsWith("c")));
        Map<Boolean, List<String>> g = s6.collect(Collectors.groupingBy(b->b.startsWith("c")));

        System.out.println(p+" " + g);
    }
}
