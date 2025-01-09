
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

//        printKeys(hashmap);
//        System.out.println("---");
//        printKeysWhere(hashmap, "i");
//        System.out.println("---");
//        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        ArrayList<String> words = findKeys(hashmap, text);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        
        ArrayList<String> words = findKeys(hashmap, text);
        
        for (String word : words) {
            System.out.println(hashmap.get(word));
        }
    }
    public static ArrayList<String> findKeys(HashMap<String, String> hashmap, String text) {
        ArrayList<String> words = new ArrayList<>();

        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                words.add(key);
            }
        }
        return words;
    }
}
