package NIO2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by moon on 29/12/2016.
 *
 * toString()
 * getNameCount() -> int
 * getName(int) -> String
 * getFileName() -> xxx.txt
 * getParent() -> Path
 * getRoot() -> Path or null if path is relative
 * isAbsolute() -> boolean
 * toAbsolutePath() -> Path
 * toRealPath() -> Path : toAbsolutePath() + throw Exception if file doesn't exist
 * subpath(index1, index2) -> Path (index1,index2 -1)
 * relativize(anotherPath) -> Path
 * resolve(anotherPath) -> Path (path + anotherPath)
 * normalize() -> Path : remove ./..
 *
 */
public class PathMethods {

    public static void main(String args[]) {
        Path path1 = Paths.get("file:///Users/../moon/Workspace/Java/OCP/IO/data");
        Path path2 = Paths.get("OCP/IO/data/lines.txt");
        System.out.println(path1.resolve(path2));
        System.out.print(path1.normalize());
    }
}
