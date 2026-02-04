package exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnO5PlusLeters {
    public static void main(String[] args) {
        List<String> carBrands = Arrays.asList("Toyota", "Ford", "Volvo", "Hyundai", "Opel");
        List<String> result = carBrands.stream()
                .filter(brand -> brand.contains("o") && brand.length() > 5)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
