public class StrNumSymb {
    public static void countNumSymb(String s) {
    int count = 0;
    String digits="";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);              
            if(Character.isDigit(ch)) {
                digits = digits + ch;
                count++;
            } 
        }
        System.out.println("String => " + s + " => " + digits + " => " + count);
    }

    public static void vowelCount(String s) {
        String s1 = s.trim();
        char[] chars = {'a', 'e', 'i', 'o', 'u', 'y'};
        int count = 0;
        String vowels = "";
        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < chars.length; j++) {
                char ch = s1.charAt(i);
                if(ch == chars[j]) {
                    vowels = vowels + ch;
                    count++;
                }
            }
        }
        System.out.println("String => " + s + " => " + vowels + " => " + count);
    }
    public static void main(String[] args) {
        String str = "iuqheiuehrg7jh34hj234jh5y287b23jhbhj34thj2b34thj";
        String str1 = " asdj f hwuqyetrnzxbcvcpoxincumbniuoqwyenzxcbmzvnbcqtyrenbvzcpoieds f mngb";
        countNumSymb(str);
        vowelCount(str1);
    }
}