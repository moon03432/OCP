package Console;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;

/**
 * Created by moon on 25/12/2016.
 */
public class ReadLine {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Console console = System.console();

        if(console == null) {
            throw new RuntimeException("Console not available");
        } else {
            // Readline 1
            console.writer().print("How excited are you about your trip today? ");
            console.flush();
            String excitementAnswer = console.readLine();

            // Readline 2
            String name = console.readLine("Please enter your name: ");

            // Readline 3: String to int
            Integer age = null;
            console.writer().print("What is your age? ");
            console.flush();
            BufferedReader reader = new BufferedReader(console.reader());
            String value = reader.readLine();
            age = Integer.valueOf(value);

            console.writer().println();
            console.format("Your name is "+name);
            console.writer().println();
            console.format("Your age is "+age);
            console.printf("Your excitement level is: "+excitementAnswer);
        } }
}
