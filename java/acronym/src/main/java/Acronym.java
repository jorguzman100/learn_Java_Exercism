import java.util.Arrays;

class Acronym {
    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String acronym = "";
        String[] words = phrase.split("[ _\\-]");
        for (String word : words) {
            acronym += word.length() > 0 ? word.substring(0, 1).toUpperCase() : "";
        }
        return acronym;
    }
}
