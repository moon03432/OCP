package Thread;

import Thread.RunnableImplementation.PrintData;
import Thread.ThreadExtension.ReadInventoryThread;

/**
 * Created by moon on 24/11/2016.
 *
 * Basic exampleof how to use thread in Java
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("begin");

        // only start() will use threads
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();

        // run() calls sequentially
//        (new ReadInventoryThread()).run();
//        new PrintData().run();
//        (new ReadInventoryThread()).run();

        System.out.println("end");
    }
}
