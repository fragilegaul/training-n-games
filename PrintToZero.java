//28 p.57
public class PrintToZero {

    public static void printToValueZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            } else {
                i = array.length;
            }
        }
    }
    public static void main(String[] args) {
        int[] array1 = {6, 5, 7, -5, 4, 6, 5, 0, 5, 6, 7};
        int[] array2 = {0, 3, 5, 4, 2, 4, -6, -100, 8};
        int[] array3 = {5, 4, 6, -5, -4, 3, 1};
        printToValueZero(array1);
        System.out.println();
        printToValueZero(array2);
        System.out.println();
        printToValueZero(array3);
    }
}