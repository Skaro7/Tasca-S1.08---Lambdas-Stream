package exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MonthsListReference {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December");
        Consumer<String> printer = System.out::println;
        months.forEach(printer);
    }
}
