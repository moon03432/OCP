package Streams.Operations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by moon on 10/12/2016.
 *
 * skip(long) -> long
 */
public class Skip {

    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("/Users/moon/Workspace/Java/OCP/IO/data/tigers.txt");

        System.out.print((char)stream.read());

        // skip() is functionally same as read(), but a bit faster
        stream.skip(2);
        stream.read();

        System.out.print((char)stream.read());
        System.out.print((char)stream.read());
    }
}
