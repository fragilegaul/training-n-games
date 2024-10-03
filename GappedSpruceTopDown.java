//55 p.38
public class GappedSpruceTopDown {

    public static void printSpruceTop() {
        int endPoint = 7;
        int from = 3;
        int to = from;
        for (int i = 0; i < endPoint; i++) {   
            if (i % 2 == 0) {
                for (int j = 0; j < endPoint; j++) {
                    if (j >= from && j <= to) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                from--;
                to++;
            } else {
                System.out.println();
            }
        }
    }

    public static void printSpruceDown() {
        int endPoint = 7;
        int from = 0;
        int to = 6;
        for (int i = endPoint - 1; i >= 0; i--) {   
            if (i % 2 == 0) {
                for (int j = 0; j < endPoint; j++) {
                    if (j >= from && j <= to) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                from++;
                to--;
            } else {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printSpruceTop();
        System.out.println();
        printSpruceDown();
    }
}