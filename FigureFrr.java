//49
public class FigureFrr {
    public static void main(String[] args) {
        int count = 13;
        int row = 0;
        int n = 1;
        for (int i = 0; i < 21; i++) {
            System.out.print("*"); 
            if (row == i) {
                count--;
                for (int j = 0; j < count; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }     
                }
                n++; 
                row += n;
                count--;
            }
            System.out.println();
        }
    }
}