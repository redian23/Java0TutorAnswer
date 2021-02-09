package Strings_and_basics_of_text_processing.StringBuilder;

public class Case1 {
    public static void main(String[] args) {
        String text = "       1        ";
        int count = (int) text.codePoints().filter(Character::isSpaceChar).count();
        System.out.println(count);
    }
}