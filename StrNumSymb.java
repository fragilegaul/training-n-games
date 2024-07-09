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
    public static void main(String[] args) {
        String str = "iuqheiuehrg7jh34hj234jh5y287b23jhbhj34thj2b34thj";
        countNumSymb(str);
    }
}
