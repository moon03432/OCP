package Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by moon on 25/12/2016.
 */
public class OldWay {

    public static void main(String[] args) throws IOException {

        // System.in is an InputStream
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String userInput = reader.readLine();
        System.out.println("You entered the following: "+userInput); }
}
