import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {
    public static String[] splitToWordsUsingDelimiters(String text) {
        if (text == null || text.isBlank()) {
            return null;
        }
        String[] words = text.trim().split("[ .,;:?!]+");
        int count = 0;
        for (String word : words) {
            if (word.isBlank()) {
                count++;
            }
        }
        if (count == words.length) {
            return null;
        }
        List<String> newWords = new ArrayList<>(Arrays.asList(words));
        newWords.removeAll(Arrays.asList("", null));
        return newWords.toArray(new String[newWords.size()]);
    }
}
