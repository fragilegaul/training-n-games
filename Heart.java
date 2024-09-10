//76

public class Heart {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 16; j++) {
                if (i == 0 && ((j > 0 && j < 5) || (j > 10 && j < 15))) {
                    System.out.print("*");
                } else if (i == 1 && ((j >= 0 && j < 6) || (j > 9 && j < 16))) {
                    System.out.print("*");
                } else if (i == 2) {
                    System.out.print("*");
                } else if (i == 3 && (j > 0 && j < 15)) {
                    System.out.print("*");
                } else if (i == 4 && (j > 2 && j < 13)) {
                    System.out.print("*");   
                } else if (i == 5 && (j > 3 && j < 12)) {
                    System.out.print("*");
                } else if (i == 6 && (j > 4 && j < 11)) {
                    System.out.print("*");
                } else if (i == 7 && (j > 6 && j < 9)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }      
}