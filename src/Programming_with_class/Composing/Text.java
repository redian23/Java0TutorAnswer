package Programming_with_class.Composing;

class Word {
    String value;
    public Word() {}

    public Word(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class Phrase extends Word{
    String value="";
    public Phrase() {
        super();
    }

    public void addValue(Word word) {
        value += " " + word.getValue();
    }

    public String getValue() {
        return value;
    }
}

public class Text {
    String header;
    private String body = "";

    public Text(Word word) {
        header = word.getValue();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getValue();
    }

    public void addBody(Phrase phrase) {
        body += " " + phrase.getValue();
    }

    public String getBody() {
        return body;
    }
}
class TextRunner {
    public static void main(String[] args) {
        Word word = new Word("quote");
        Text text = new Text(word);

        Word word1 = new Word("quote's");
        Word word2 = new Word("Les");
        Word word3 = new Word("Brawn");

        Phrase phrase = new Phrase();
        phrase.addValue(word1);
        phrase.addValue(word2);
        phrase.addValue(word3);

        text.addBody(phrase);

        System.out.println("Head: "+text.getHeader());
        System.out.println("Body: "+text.getBody());

    }
}