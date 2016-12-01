package Stream.ParallelStream;

import java.util.Arrays;

/**
 * Created by moon on 29/11/2016.
 *
 * ParallelStream: suggest using concurrent collections
 */
public class Processing {

    public static void main(String[] args) {

        // Example 1
        Arrays.asList(1,2,3,4,5,6).parallelStream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // Example 2: forEachOrdered() cost performance
        Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(s -> System.out.print(s + " "));
        System.out.println();

        // Example 3: findAny
        System.out.println(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get()); // random

        // skip(), limit(), findFirst() results will be consistent with serial streams but cost performance
    }
}
