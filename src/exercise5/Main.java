package exercise5;

public class Main {
    public static void main(String[] args) {
        PiProvider piProvider = () -> 3.1415;
        double pi = piProvider.getPiValue();
        System.out.println(pi);
    }
}