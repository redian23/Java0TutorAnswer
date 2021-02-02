package Basics_of_software_code_development.Arifmetic;

public class Case4 {
    public static void main(String[] args) {
        double x = 123.456;
        double result = (x * 1000) % 1000 + (int) x / 1000.0;

        System.out.println(result);
    }
}
