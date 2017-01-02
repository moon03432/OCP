package Tests;

import java.io.*;

/**
 * Created by moon on 31/12/2016.
 */
public class FileTests {

    public static void main(String[] args) throws FileNotFoundException {
        // print data/lines.txt
        File file = new File("data/lines.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
        }

        // copy data/lines.txt to data/lines-copy.txt
    }
}
