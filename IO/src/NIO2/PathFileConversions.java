package NIO2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by moon on 29/12/2016.
 *
 * Path.toFile() -> File
 * File.toPath() -> Path
 *
 * Path vs File: path doesn't require the real file existence
 */
public class PathFileConversions {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/moon/Workspace/Java/OCP/IO/data/lines.txt");
        File file = path.toFile();
        Path path2 = file.toPath();

        List<String> data = Files.readAllLines(path2);
        System.out.println(data);
    }
}
