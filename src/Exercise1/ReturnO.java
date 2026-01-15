package Exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class ReturnO {
    public static void main(String[] args) {
        List<String> carBrands = Arrays.asList("Toyota", "Ford", "Volvo", "Hyundai", "Opel");
        Predicate<String> containsO = brand -> brand.contains("o");
        List<String> result = carBrands.stream()
                .filter(containsO)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}