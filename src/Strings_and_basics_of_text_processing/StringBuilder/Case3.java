package Strings_and_basics_of_text_processing.StringBuilder;

public class Case3 {
    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(" 1234567654321"));
    }
}
