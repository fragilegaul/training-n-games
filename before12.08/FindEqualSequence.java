import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEqualSequence {
    public static int countIgnoreCaseAndSpaces(String[] words, String sample) {
        if (words == null || words.length == 0 || sample == null || sample.isEmpty()) {
            return 0;
        }
        String newSample = sample.strip() + "\\b";
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(s);
            sb.append(" ");
        }
        String strWords = sb.toString();
        int count = 0;
        Pattern p = Pattern.compile(newSample, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(strWords);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
        String[] words = new String[]{" PaSeKT    \t", "pasek", "pAsek", "PAS  EK", };
        String sample = "pasek   ";
        int countResult = countIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);
    }
}
