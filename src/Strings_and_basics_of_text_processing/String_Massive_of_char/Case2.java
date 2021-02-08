package Strings_and_basics_of_text_processing.String_Massive_of_char;

public class Case2 {
    public static void main(String[] args) {

            String text = "word and word";
            String str1 = "word";
            String str2 = "letter";

            text=text.replace(str1, str2);

            System.out.println(text);
    }
}
