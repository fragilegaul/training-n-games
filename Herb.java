//29
public class Herb {
    public static void main(String[] args) {
        int left = 0;
        int right = 18;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 19; j++) {
                if (((i == 0 || i == 11) && j == 9) || (i == 10 && (j == 5 || j == 13))) {
                    System.out.print("*");
                } else if ((i == 1 && (j == 0 || j == 9 || j == 18)) || (i == 9 && (j % 2 == 0))) {
                    System.out.print("*");
                } else if ((i > 1 && i < 5) && (j == 0 || j == 9 || j == 18 || j == left || j == right)) {
                    System.out.print("*");
                } else if ((i == 5) && (j == 0 || j == 3 || j == 9 || j == 11 || j == 18 || j == 7 || j == 15)) {
                    System.out.print("*");
                } else if ((i == 6) && (j == 0 || j == 2 || j == left || j == 12 || j == 16 || j == 18)) {
                    System.out.print("*");
                } else if ((i == 7) && (j == 0 || j == 5 || j == 13 || j == 18)) {
                    System.out.print("*");
                } else if ((i == 8) && (j == 0 || j == 4 || j == 9 || j == 14 || j == 18)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 
            }
            left++;
            right--;
            System.out.println();
        }
    }
}