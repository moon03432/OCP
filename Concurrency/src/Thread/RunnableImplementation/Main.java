package Thread.RunnableImplementation;

/**
 * Created by moon on 30/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        Runnable printData = new PrintData();

        Thread thread = new Thread(printData);
        thread.start();
    }
}
