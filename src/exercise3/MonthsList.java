package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MonthsList {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December");
        Consumer<String> printer = month -> System.out.println(month);
        months.forEach(printer);
    }
}
