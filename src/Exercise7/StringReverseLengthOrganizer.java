package Exercise7;

import java.util.Arrays;
import java.util.List;

public class StringReverseLengthOrganizer {
    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList("fg43qtfqwrfq3", "wejmoiifrwepmfwe", "317uu803147803248032", "432", "432432");
        mixedList.sort((a, b) -> {
            if (a instanceof String && b instanceof String) {
                return Integer.compare(((String) b).length(), ((String) a).length());
            }
            return 0;
        });
        System.out.println(mixedList);
    }
}
