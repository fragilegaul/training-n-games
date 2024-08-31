//35
public class Zero {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 11; j++) {
                if ((i == 0 || i == 5) && (j > 2 && j < 8)) {
                    System.out.print("*");
                } else if ((i > 0 && i < 5) && (j < 3 || j > 7)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}