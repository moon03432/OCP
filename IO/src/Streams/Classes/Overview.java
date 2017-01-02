package Streams.Classes;

import java.io.*;

/**
 * Created by moon on 07/12/2016.
 *
 * 4 abstract basic streams: InputStream, OutputStream, Reader, Writer
 *
 * FileInputStream, FileOutputStream, FileReader, FileWriter
 * BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter
 * ObjectInputStream, ObjectOutputStream
 * InputStreamReader, OutputStreamWriter
 * PrintStream, PrintWriter
 *
 */
public class Overview {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("xx");
        new FileReader(file);
//        new BufferedInputStream(new FileReader("zoo-data.txt")); // DOES NOT COMPILE
//        new BufferedWriter(new FileOutputStream("zoo-data.txt")); // DOES NOT COMPILE
//        new ObjectInputStream(new FileOutputStream("zoo-data.txt")); // DOES NOT COMPILE
//        new BufferedInputStream(new InputStream()); // DOES NOT COMPILE
    }
}
