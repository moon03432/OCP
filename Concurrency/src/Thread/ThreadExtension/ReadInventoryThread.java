package Thread.ThreadExtension;

/**
 * Created by moon on 24/11/2016.
 *
 * Normally we don't extend a Thread unless we want to create our own Thread
 */
public class ReadInventoryThread extends Thread {

    public void run() {
        System.out.println("printing zoo inventory");
    }
}
