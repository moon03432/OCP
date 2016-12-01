package Thread.RunnableImplementation;

/**
 * Created by moon on 24/11/2016.
 *
 * implement Runnable to be used in an ExecutorService
 */
public class PrintData implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<3; i++) {
            System.out.println("printing record: "+i);
        }
    }
}
