package Streams.Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by moon on 10/12/2016.
 *
 * markSupported(), mark(int), reset()
 */
public class Mark {

    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("/Users/moon/Workspace/Java/OCP/IO/data/abcd.txt");

        System.out.println((char)stream.read());

        // mark seems unsupported
//        System.out.println(stream.markSupported());

        if (stream.markSupported()) {
            stream.mark(100);
            System.out.print((char)stream.read());
            System.out.print((char)stream.read());
            stream.reset();
        }

        System.out.print((char)stream.read());
        System.out.print((char)stream.read());
        System.out.print((char)stream.read());
    }
}
