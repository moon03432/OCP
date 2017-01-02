package Stream.ParallelStream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by moon on 29/11/2016.
 */
public class PerformanceMeasuring {

    private static class WhaleDataCalculator {

        private int processRecord(int input) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // Handle interrupted exception
            }
            return input + 1;
        }

        private void processAllData(List<Integer> data) {
            data.stream().map(a -> processRecord(a)).count();
        }

        private void processAllDataInParallel(List<Integer> data) {
            data.parallelStream().map(a -> processRecord(a)).count();
        }
    }

    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();
        // Define the data
        List<Integer> data = new ArrayList<Integer>();
        for(int i = 0; i<1000; i++) data.add(i);

        // Process the data
        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = (System.currentTimeMillis() - start)/1000.0;
        System.out.println("\nTasks completed in: "+time+" seconds");

        // Process the data in parallel
        start = System.currentTimeMillis();
        calculator.processAllDataInParallel(data);
        time = (System.currentTimeMillis() - start)/1000.0;
        System.out.println("\nParallel tasks completed in: "+time+" seconds");
    }
}
