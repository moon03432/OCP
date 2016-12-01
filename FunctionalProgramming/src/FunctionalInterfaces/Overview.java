package FunctionalInterfaces;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Created by moon on 28/11/2016.
 *
 * Functional Interfaces        Single Abstract Method
 *
 * Supplier<T>                  get() -> T
 * Consumer<T>                  accept(T) -> void
 * BiConsumer<T, U>             accept(T,U) -> void
 * Predicate<T>                 test(T) -> boolean
 * BiPredicate<T, U>            test(T,U) -> boolean
 * Function<T, R>               apply(T) -> R
 * BiFunction<T, U, R>          apply(T,U) -> R
 * UnaryOperator<T>             apply(T) -> T
 * BinaryOperator<T>            apply(T,T) -> T
 *
 * Others see java.util.function
 */
public class Overview {

    public static void main(String[] args) {
//        Function<List<String>> ex1 = x -> x.get(0); // doesn't compile: missing return type
//        UnaryOperator<Long> ex2 = (Long l) -> 3.14; // doesn't compile: return type is double not Long
//        Predicate ex3 = String::isEmpty;            // doesn't compile: missing generic type
    }
}
