package Stream.ParallelStream;

import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by moon on 30/11/2016.
 *
 * <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner);
 *
 * Difference between collect() and reduce()?
 */
public class Collect {

    public static void main(String[] args) {

        // 3 arguments collect()
        Stream<String> stream = Stream.of("w","o","l","f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll); // Sorted
        System.out.println(set);

        // 1 argument collect()
        Stream<String> stream2 = Stream.of("w","o","l","f").parallel();
        Set<String> set2 = stream2.collect(Collectors.toSet());
        System.out.println(set2);
    }
}
