package Exercise6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthOrganizer {
    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList("fg43qtfqwrfq3", "wejmoiifrwepmfwe", "317uu803147803248032", "432", "432432");
        mixedList.sort((a, b) -> {
            if (a instanceof String && b instanceof String) {
                return Integer.compare(((String) a).length(), ((String) b).length());
            }
            return 0;
        });

        List<String> result = mixedList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
