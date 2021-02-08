package Strings_and_basics_of_text_processing.String_Massive_of_char;

public class Case3 {
    public static void main(String[] args) {
        String text = "this 1 text contains 2 digits";
        int count = (int) text.codePoints().filter(Character::isDigit).count();
        System.out.println(count);
    }
}
