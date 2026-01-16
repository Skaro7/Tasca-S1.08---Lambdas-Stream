package Exercise8;

public class Main {
    public static void main(String[] args) {
        StringReverse reverser = str -> new StringBuilder(str).reverse().toString();
        String result = reverser.reverse("abcdef");
        System.out.println(result);
    }
}
