package ExecutorService.SubmitTasks;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * Created by moon on 23/11/2016.
 *
 * Callable: can return value, can throw Exception
 * Supplier: can return value, cannot throw Exception
 */
public class CallableVsSupplier {
    public static void useCallable(Callable<Integer> expression) {}
    public static void useSupplier(Supplier<Integer> expression) {}
    public static void use(Supplier<Integer> expression) {}
    public static void use(Callable<Integer> expression) {}

    public static void main(String[] args) {
        useCallable(()-> {throw new IOException();});
//        useSupplier(()-> {throw new IOException();}); // Supplier doesn't handle exception
//        use(()-> {throw new IOException();});         // Ambiguous
        use((Callable<Integer>)()-> {throw new IOException();}); // Complies
    }
}
