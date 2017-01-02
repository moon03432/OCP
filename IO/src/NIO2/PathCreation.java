package NIO2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by moon on 26/12/2016.
 */
public class PathCreation {

    public static void main(String[] args) throws IOException, URISyntaxException {

//        Path path = Paths.get("data/lines.txt");
//        Path path = Paths.get("data","lines.txt"); // no separators

        // URI could be http://, ftp://, file://, etc.
        Path path = Paths.get(new URI("file:///Users/moon/Workspace/Java/OCP/IO/data/lines.txt"));

        System.out.println(path.toUri());
        System.out.println("NameCount = " + path.getNameCount());
        System.out.println("Root = " + path.getRoot());

        List<String> data = Files.readAllLines(path);

        System.out.println(data);
    }
}
