public class SwapSymbol {
    public static void swapSymb(String s) {
        String[] splited = s.split(" ");
        for(String str : splited) {
            StringBuilder sb = new StringBuilder(str);
            for(int i = 0; i < sb.length() - 1; i += 2) {
                sb.insert(i, sb.charAt(i + 1)).deleteCharAt(i + 2);
            }
            System.out.print(sb + " ");
        }
    }
    public static void main(String[] args) {
        String str = " I was really too honest a man to be a politician and live";
        swapSymb(str);
    }
}