package Exercise6;

import java.util.Arrays;
import java.util.List;

public class StringLengthOrganizer {
    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList("fg43qtfqwrfq3", "wejmoiifrwepmfwe", "317uu803147803248032", "432", "432432");
        mixedList.sort((a, b) -> {
            if (a instanceof String && b instanceof String) {
                return Integer.compare(((String) a).length(), ((String) b).length());
            }
            return 0;
        });
        System.out.println(mixedList);
    }
}
