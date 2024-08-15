public class StringsJoin {
    public static String joinWordsIntoOneString(String[] words) {
        if (words == null || words.length == 0) {
            return null;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String word : words) {
            if (word == null || word.isBlank()) {
                count++;
            } else {
                if (first) {
                    first = false;
                } else {
                    sb.append(", ");
                }
                sb.append(word);
            }
        }
        if (count == words.length) {
            return null;
        }
        return sb.insert(0, "[").insert(sb.length(), "]").toString();
    }
}