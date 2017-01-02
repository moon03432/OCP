package Files;

import java.io.File;

/**
 * Created by moon on 05/12/2016.
 *
 * File creation
 */
public class FileSample {

    public static void main(String[] args) {
	// write your code here
        File file = new File("home/smith/data/zoo.txt");
        System.out.println(file.exists());

        File parent = new File("/home/smith");
        File child = new File(parent, "data/zoo.txt");

        File file1 = new File("data", "lines.txt");
        System.out.println(file1.exists());
    }
}
