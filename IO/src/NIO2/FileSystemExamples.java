package NIO2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by moon on 26/12/2016.
 */
public class FileSystemExamples {

    public static void main(String[] args) throws IOException, URISyntaxException {

        // Example 1: FileSystems.getDefault()
        Path path1 = FileSystems.getDefault().getPath("/Users/moon/Workspace/Java/OCP/IO/data/lines.txt");
        List<String> data = Files.readAllLines(path1);
        System.out.println(data);

        // Example 2: FileSystems.getFileSystem()
        FileSystem fileSystem = FileSystems.getFileSystem(new URI("file:///"));
        Path path2 = fileSystem.getPath("/Users/moon/Workspace/Java/OCP/IO/data/abcd.txt");
        List<String> data2 = Files.readAllLines(path2);
        System.out.println(data2);
    }
}
