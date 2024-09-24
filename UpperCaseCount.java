//14 p.112

public class UpperCaseCount {
    
    public static void main(String[] args) {
        String stringToSeek = "sdgHjhgJHGHJggSLsjLKSkjhkjhSjhkSkhsk";
        int counter = 0;
        for (int i = 0; i < stringToSeek.length(); i++) {
            if (Character.isUpperCase(stringToSeek.charAt(i))) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}