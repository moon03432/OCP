package ExecutorService.ThreadPool;

/**
 * Created by moon on 24/11/2016.
 *
 * In practice:
 * If CPU intensive, define thread pool size to number of CPUs
 * If waiting a lots of IO from disk or network, pool size could be larger
 */
public class GetNumberOfCPU {
    public static void main(String[] args) {
        System.out.println("Number of CPUs: " + Runtime.getRuntime().availableProcessors()); // 4
    }
}
