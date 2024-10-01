//16 p.113
public class CountVowels {
    public static void main(String[] args) {
        String letters = "asdjfhwuqyetrnzxbcvcpoxincumbniuoqwyenzxcbmzvnbcqtyrenbvzcpoiedsfmngb";
        char[] charsToFind = {'a', 'e', 'i', 'o', 'u', 'y'};
        int count = 0;
        for (int i = 0; i < charsToFind.length; i++) {
            for (int j = 0; j < letters.length(); j++) {
                if (charsToFind[i] == letters.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}