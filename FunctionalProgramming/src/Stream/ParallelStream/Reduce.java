package Stream.ParallelStream;

import java.util.Arrays;

/**
 * Created by moon on 29/11/2016.
 *
 * reduce(U identity, BiFunction<U, T, U> accumulator, BinaryOperator<U> combiner) -> U
 *
 * combiner is suggested for parallel processing
 */
public class Reduce {

    public static void main(String[] args) {

        // Example 1: associative
        System.out.println(Arrays.asList("w","o","l","f").parallelStream().reduce("", (c,s) -> c+s, (a,b) -> a+b));

        // Example 2
        System.out.println(Arrays.asList("w","o","l","f").parallelStream().reduce("X", String::concat));

        // Example 3: not associative, random result
        System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().reduce(0, (x,y)->x-y));
    }
}
