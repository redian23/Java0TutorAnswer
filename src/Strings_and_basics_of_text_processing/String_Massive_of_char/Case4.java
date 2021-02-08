package Strings_and_basics_of_text_processing.String_Massive_of_char;

public class Case4 {
    public static void main(String[] args) {
        String str = "1, 2, 3, 4,6,5,6,56,5,6,5";
        String delimiter = ",";
        String[] temp = str.split(delimiter);
        int count = temp.length;
        System.out.println(count);
    }
}
