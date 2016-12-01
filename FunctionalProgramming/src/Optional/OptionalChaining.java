package Optional;

import java.util.Optional;

/**
 * Created by moon on 29/11/2016.
 */
public class OptionalChaining {

    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(11);

        optional.map(n -> "" + n)
                .filter(s -> s.length() == 2)
                .ifPresent(System.out::println);
    }
}
