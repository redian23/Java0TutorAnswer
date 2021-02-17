package Programming_with_class.Composing;

class Word {
    String value;

    Word() {}

    Word(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }
}

class Phrase extends Word {
    Phrase() {
        super();
    }

    void addValue(Word word) {
        value += " " + word.getValue();
    }

    String getValue() {
        return value;
    }
}

class Text {
    String header;
    private String body = "";

    Text(Word word) {
        header = word.getValue();
    }

    String getHeader() {
        return header;
    }

    void addBody(Word word) {
        body += " " + word.getValue();
    }

    String getBody() {
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

        System.out.println("Head: " + text.getHeader());
        System.out.println("Body: " + text.getBody());

    }
}