package Strings_and_basics_of_text_processing.StringBuilder;

public class Case5 {
    public static void main(String[] args) {

        String str = "nissan x-trail, xor beginner, xxx.";
        char[] symb = str.toCharArray();
        int count = 0;

        for (char c : symb)
            if (c == 'a')
                count++;

            System.out.println(count);
    }
}
