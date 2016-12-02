package ForkJoinFramework;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by moon on 30/11/2016.
 *
 * RecursiveAction
 *
 * ForkJoinTask.invokeAll(RecursiveAction action1, RecursiveAction action2)
 *
 * ForkJoinPool.invoke(ForkJoinTask task)
 */
public class WeighAnimalAction extends RecursiveAction {
    private int start;
    private int end;
    private Double[] weights;

    public WeighAnimalAction(Double[] weights, int start, int end) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    // A worker can do at most 3 weighs
    protected void compute() {
        System.out.println("[start="+start+",end="+end+"]");
        if(end-start <= 3)
            for(int i=start; i<end; i++) {
                weights[i] = (double)new Random().nextInt(100);
                System.out.println("Animal Weighed: "+i);
            }
        else {
            int middle = start+((end-start)/2);
            invokeAll(
                    new WeighAnimalAction(weights,start,middle),
                    new WeighAnimalAction(weights,middle,end)
            );
        }
    }

    public static void main(String[] args) {
        Double[] weights = new Double[100];

        ForkJoinTask<?> task = new WeighAnimalAction(weights, 0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

        // Print results
        System.out.println();
        System.out.print("Weights: ");
        Arrays.asList(weights).parallelStream().forEach(d -> System.out.print(d.intValue()+" "));
        System.out.println();
    }
}
