package Files;

import java.io.File;

/**
 * Created by moon on 05/12/2016.
 *
 * file.exists()
 * file.getAbsolutePath()
 * file.isDirectory()
 * file.isFile()
 * file.getParent()
 * file.length()
 * file.lastModified()
 * file.listFiles()
 */
public class ReadFileInformation {

    public static void main(String[] args) {
        File file = new File("/usr/local/opt/apache-maven/conf");
        System.out.println("Files Exists: "+file.exists());

        if(file.exists()) {
            System.out.println("Absolute Path: "+file.getAbsolutePath());
            System.out.println("Is Directory: "+file.isDirectory());
            System.out.println("Parent Path: "+file.getParent());

            if(file.isFile()) {
                System.out.println("Files size: "+file.length());
                System.out.println("Files LastModified: "+file.lastModified());
            } else {
                for(File subfile: file.listFiles()) {
                    System.out.println("\t"+subfile.getName());
                }
            }
        }
    }
}
