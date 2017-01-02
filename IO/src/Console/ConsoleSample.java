package Console;

import java.io.Console;

/**
 * Created by moon on 25/12/2016.
 *
 * System.console is a singleton
 */
public class ConsoleSample {

    public static void main(String[] args) {

        Console console = System.console();

        if(console != null) {
            String userInput = console.readLine();
            console.writer().println ("You entered the following: "+userInput);
        } else {
            System.out.println("System.console is null");
        }
    }
}
