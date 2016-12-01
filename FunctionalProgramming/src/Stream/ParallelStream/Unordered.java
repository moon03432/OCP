package Stream.ParallelStream;

import java.util.Arrays;

/**
 * Created by moon on 29/11/2016.
 *
 * unordered() has no impact on serial stream
 * but can improve performance for ordered operation for parallel streams
 * but the order will be lost
 */
public class Unordered {

    public static void main(String[] args) {

        Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel();
    }
}
