
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> words;

    public DictionaryOfManyTranslations() {
        this.words = new HashMap<>();
    }

    public void add(String word, String translation) {

        if (!words.containsKey(word)) {
            words.put(word, new ArrayList<>());
        }

        words.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return words.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        words.remove(word);
    }
}
