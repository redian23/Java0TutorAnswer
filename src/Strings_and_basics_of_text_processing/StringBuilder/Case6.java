package Strings_and_basics_of_text_processing.StringBuilder;

public class Case6 {
    public static void main(String[] args) {
        String s = "redian";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            sb.append(s.charAt(i)).append(s.charAt(i));
        System.out.println(sb.toString());
    }
}
