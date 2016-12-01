package Thread.LambdaFunction;

/**
 * Created by moon on 24/11/2016.
 *
 * Start a thread by lambda
 * Check thread status and sleep (line 21)
 */
public class Main {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        new Thread(()-> {
            for (int i=0; i<500; i++) Main.counter++;
        }).start();

        while (Main.counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 sec
        }

        System.out.println("Reached!");
    }
}
