package FunctionalInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Created by moon on 28/11/2016.
 *
 * get() -> T
 */
public class SupplierExamples {

    public static void main(String[] args) {

        // Example 1
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        // Example 2
        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();

        System.out.println(s3.get());
        System.out.println(s4.get());

        // Example 3
        Supplier<ArrayList<String>> s5 = ArrayList::new;
        ArrayList<String> a5 = s5.get();
        System.out.println(a5);
        System.out.println(s5); // FunctionalInterfaces.SupplierExamples$$Lambda$8/1389133897@5b6f7412


    }



}
