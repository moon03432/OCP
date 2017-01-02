package Streams.Classes;

import java.io.*;

/**
 * Created by moon on 10/12/2016.
 *
 * FileInputStream/FileOutputStream
 * BufferedInputStream/BufferedOutputStream
 *
 * FileInputStream.read() -> int: read byte by byte, -1 means EOF
 * BufferedInputStream.read(byte[]) -> int: read and fill buffer, 0 means EOF
 *
 */
public class InputOutputStreams {

    public static void fileStreamCopy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while ((b = in.read()) != -1) { // read byte by byte, -1 is End of File
                out.write(b);
            }
        }
    }

    public static void bufferedStreamCopy(File source, File destination) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) { // read and fill buffer
                out.write(buffer, 0, length);
                out.flush();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("/Users/moon/Workspace/Java/OCP/IO/data/abcd.txt");
        File destination = new File("/Users/moon/Workspace/Java/OCP/IO/data/abcd-copy.txt");
//        fileStreamCopy(source, destination);
        bufferedStreamCopy(source, destination);
    }
}
