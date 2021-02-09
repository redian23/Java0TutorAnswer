package Strings_and_basics_of_text_processing.StringBuilder;

public class Case7 {
    public static void main(String[] args) {

        String str = "assadas as asd as asda sda s as a s a    dasd`";
        String result = new StringBuilder(str).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);

    }
}
