import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    // Temporary getter()
    public List<String> getLanguages() {return this.languages;}

    // 1. Define a function to check if the language list is empty
    public boolean isEmpty() {
        return this.languages.isEmpty();
    }

    // 2. Define a function to add a language to the list
    public void addLanguage(String language) {
        this.languages.add(language);
    }

    // 3. Define a function to remove a language from the list
    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    // 4. Define a function to return the first item in the list
    public String firstLanguage() {
        // return this.languages.get(0);
        return this.languages.getFirst();
    }

    // 5. Define a function to return how many languages are in the list
    public int count() {
        return this.languages.size();
    }

    // 6. Define a function to determine if a language is in the list
    public boolean containsLanguage(String language) {
        return this.languages.contains(language);
    }

    // 7. Define a function to determine if the list is exciting
    public boolean isExciting() {
        return this.languages.contains("Java") || this.languages.contains("Kotlin");

    }

    /* public static void main(String[] args) {

        LanguageList languageList = new LanguageList();

        // 1. Define a function to check if the language list is empty
        System.out.println(languageList.isEmpty());

        // 2. Define a function to add a language to the list
        languageList.addLanguage("Kotlin");
        languageList.addLanguage("Python");
        languageList.addLanguage("Scala");

        // Temporary logging the list - for enhaced loop
        for (String language : languageList.getLanguages()) {System.out.println(language);}
        // Temporary logging the list - forEach
        languageList.getLanguages().forEach(language -> System.out.println(language));

        // 3. Define a function to remove a language from the list
        languageList.removeLanguage("Scala");

        // 4. Define a function to return the first item in the list
        String kotlin = languageList.firstLanguage(); // "Kotlin"
        System.out.printf("%nkotlin: %S%n%n", kotlin);

        // 5. Define a function to return how many languages are in the list
        int count = languageList.count(); // 2
        System.out.printf("count: %d%n%n", count);

        // 6. Define a function to determine if a language is in the list
        boolean learningPython = languageList.containsLanguage("Python"); // true
        boolean learningRuby = languageList.containsLanguage("Ruby"); // false
        System.out.printf("learningPython: %b, learningRuby: %b %n%n", learningPython, learningRuby);

        // 7. Define a function to determine if the list is exciting
        LanguageList javaLanguageList = new LanguageList();
        javaLanguageList.addLanguage("Java");
        javaLanguageList.addLanguage("JavaScript");

        LanguageList neitherKotlinNorJavaLanguageList = new LanguageList();
        neitherKotlinNorJavaLanguageList.addLanguage("Python");
        neitherKotlinNorJavaLanguageList.addLanguage("Golang");

        System.out.println(javaLanguageList.isExciting()); // true
        System.out.println(neitherKotlinNorJavaLanguageList.isExciting()); // false
    } */
}
