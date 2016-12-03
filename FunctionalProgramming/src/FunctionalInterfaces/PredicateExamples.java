package FunctionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by moon on 28/11/2016.
 *
 * test(T) -> boolean
 */
public class PredicateExamples {

    public static void main(String[] args) {

        // Example 1: Predicate
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        // Example 2: BiPredicate
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));

        // Example 3: Chaining
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> notBrownEgg = egg.and(brown.negate());

        System.out.println(notBrownEgg.test("brown egg"));

        // Example 4: Vivi
        Predicate<String> meat = a -> a.endsWith("meat");
        Predicate<String> pig = a -> a.contains("pig");
        Predicate<String> sheep = a -> a.contains("sheep");
        Predicate<String> Lunch = meat.and(pig.and(sheep));

        System.out.println(Lunch.test("pig meat and sheep meat"));

    }
}
