package Streams.Classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by moon on 24/12/2016.
 *
 * FileReader/FileWriter
 * BufferedReader/BufferedWriter
 *
 * BufferedReader.readLine() -> String
 * writer.write(String)
 * writer.newLine();
 *
 * Advantages:
 * 1. Enable using String methods
 * 2. Automatically detect EOL (End of Line, '\n')
 * 3. Avoid encoding
 */
public class ReadersAndWriters {

    private static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while ((s = reader.readLine()) != null) {
                data.add(s);
            }
        }

        return data;
    }

    private static void writeFile(List<String> data, File destination) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
            for (String s: data) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("/Users/moon/Workspace/Java/OCP/IO/data/lines.txt");
        File destination = new File("/Users/moon/Workspace/Java/OCP/IO/data/lines-copy.txt");

        List<String> data = readFile(source);
        writeFile(data, destination);
    }
}
