package Strings_and_basics_of_text_processing.String_Massive_of_char;

public class Case5 {
    public static void main(String[] args) {

        String text = "Нужный      текст     " +
                "      между       " +  "        пробелами";

        System.out.println(text);
        System.out.println("После удаления лишних пробелов -> " + (text).replaceAll("\\s+", " "));
    }
}
