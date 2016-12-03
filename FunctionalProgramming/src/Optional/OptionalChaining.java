package Optional;

import java.util.Optional;

/**
 * Created by moon on 29/11/2016.
 *
 * Optional.of(T) -> Optional<T>
 * Optional.ofNullable(T) -> Optional<T>
 * Optional<T>.map(Function<T,R>) -> Optional<R>
 * Optional<T>.filter(Predicate<T>) -> Optional<T>
 * Optional<T>.ifPresent(Consumer<T>) -> void
 */
public class OptionalChaining {

    public static void main(String[] args) {
        Optional<Integer> optional = Optional.ofNullable(null);

        optional.map(n -> "" + n)
                .filter(s -> s.length() == 2)
                .ifPresent(System.out::println);
    }
}
