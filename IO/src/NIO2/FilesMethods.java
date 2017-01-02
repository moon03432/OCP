package NIO2;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

/**
 * Created by moon on 31/12/2016.
 *
 * Files.exists(path) -> boolean
 * Files.isSameFile(path1, path2) -> boolean
 * Files.createDirectory(path)
 * Files.createDirectories(path): mkdir -p path
 * Files.copy(path1, path2)
 * Files.move(path1, path2)
 * Files.delete(path)
 * Files.deleteIfExists(path)
 * Files.newBufferedReader(path, charset)
 * Files.newBufferedWriter(path, charset)
 * Files.readAllLines(path)
 *
 * Files.isDirectory(path) -> boolean
 * Files.isRegularFile(path) -> boolean
 * Files.isSymbolicLink(path) -> boolean
 * Files.isHidden(path) -> boolean
 * Files.isReadable(path) -> boolean
 * Files.isExecutable(path) -> boolean
 * Files.size(path) -> long
 *
 * Files.getLastModifiedTime(path) -> FileTime
 * Files.setLastModifiedTime(path, FileTime)
 *
 * Files.getOwner(path) -> UserPrincipal
 * Files.setOwner(path, userPrincipal)
 */
public class FilesMethods {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data/lines.txt");
        System.out.println(Files.exists(path));

        // copy
        Path output = Paths.get("data/lines-copy.txt");
        Files.copy(path, output);

        // FileTime
        System.out.println(Files.getLastModifiedTime(path));
        Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
        System.out.println(Files.getLastModifiedTime(path));

        // Owner
        System.out.println(Files.getOwner(path));
        UserPrincipal root = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("root");
        System.out.println(root);
        UserPrincipal moon = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("moon");
        Files.setOwner(path, moon);
        System.out.println(Files.getOwner(path));


    }
}
