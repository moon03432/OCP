package ReviewQuestions;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

/**
 * Created by moon on 09/12/2016.
 */
public class CountZooAnimals {

    public static Integer performCount(int exhibitNumber) throws Exception {

        while (true) {Thread.sleep(100);}
//        return null;
//        throw new Exception();
    }

    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get()); // o1
        }
        catch (Exception e) {
            System.out.println("Exception!");
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        final List<Future<?>> results = new ArrayList<>();
        IntStream.range(0, 10).forEach(i -> results.add(service.submit(() -> performCount(i)))); // o2
        results.stream().forEach(f -> printResults(f));
        service.shutdown(); }
}
