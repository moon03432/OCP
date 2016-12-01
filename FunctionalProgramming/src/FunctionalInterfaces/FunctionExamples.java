package FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by moon on 28/11/2016.
 *
 * apply(T) -> R
 */
public class FunctionExamples {

    // Internal interface
    private interface TriFunction<T,U,V,R> {
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {

        // Example 1
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5

        // Example 2
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick

        // Example 3: customized interface
        TriFunction<Integer, Integer, Integer, Integer> t1 = (x,y,z) -> x+y+z;

        System.out.println(t1.apply(1,2,3));

    }
}
