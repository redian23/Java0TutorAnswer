package Strings_and_basics_of_text_processing.StringBuilder;

public class Case8 {
    static String max(String par)
    {
        String[]words = par.split(" ");
        String resstring = "";
        for(String word: words)
        {
            if(word.length()>resstring.length())
                resstring=word;
        }
        return(resstring);
    }

    static public void main(String[] args)
    {
        String somestring = "one two three four five";
        String maxword = max(somestring);
        System.out.println(maxword);
        System.out.println(maxword.length());
    }
}
