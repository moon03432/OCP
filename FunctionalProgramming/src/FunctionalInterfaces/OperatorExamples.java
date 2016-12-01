package FunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Created by moon on 28/11/2016.
 *
 * apply(T) -> T
 *
 * UnaryOperator<T> extends Function<T,T>
 * BinaryOperator<T> extends Function<T,T,T>
 *
 * Operator is a more precise Function ^_^
 */
public class OperatorExamples {

    public static void main(String[] args) {

        // Example 1
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));

        // Example 2
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick"));
        System.out.println(b2.apply("baby ", "chick"));
    }
}
