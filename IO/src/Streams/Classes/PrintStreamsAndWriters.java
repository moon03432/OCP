package Streams.Classes;

import Streams.Classes.Serialization.Animal;

import java.io.*;

/**
 * Created by moon on 24/12/2016.
 *
 * PrintStream extends OutputStream
 * PrintWriter extends Writer
 *
 * write()
 * print(), println(): why prefer using println()? line separator is OS dependant
 * printf() = format(), exactly same
 *
 */
public class PrintStreamsAndWriters {


    public static void main(String[] args) throws IOException {

        // PrintStream
        try ( PrintStream stream = new PrintStream(System.out)) {
            stream.println("This is a PrintStream");
        }

        // PrintWriter
        File source = new File("/Users/moon/Workspace/Java/OCP/IO/data/printer.txt");
        try ( PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(source)))) {
            // print() = write(String.valueOf())
            out.println(2.0);
            out.write(String.valueOf(2.0));
            out.println();

            Animal animal = new Animal("Tommy Tiger",5,'T');
            out.println(animal);
            out.write(animal==null? "null":animal.toString());
            out.println();

            out.format("It has rained %s inches this year", 10.12);
            out.println();
            out.printf("It may rain %s more inches this year", 21.2);
        };


    }

}
