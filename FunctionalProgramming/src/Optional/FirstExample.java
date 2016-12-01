package Optional;

import java.util.Optional;

/**
 * Created by moon on 28/11/2016.
 *
 * Optional is like null, but it implies possibility of nullity and provide an uniform way to treat it
 */
public class FirstExample {

    private static Optional<Double> average(int... scores) {

        if (scores.length == 0) return Optional.empty();

        int sum = 0;
        for (int score: scores) sum += score;

        return Optional.of((double)sum / scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average(90,100));
        System.out.println(average());
//        System.out.println(average().get()); // NoSuchElementException
    }
}
