import java.util.Arrays;

public class DeleteMax {

    private static int[] deleteMaxValueThreeTimes(int[] array) {
        int[] newArray = new int[array.length-1];
        int max = findMax(array);
        for (int i = 0, j = 0; i < array.length;) {
            if (array[i] == max) {
                i++;
            } else {
                newArray[j] = array[i];
                j++;
                i++;
            }
        } 
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{555555, 4, 6, 4, 34, 21, 65443, 0, 54, 23, 12};
        deleteMaxValueThreeTimes(deleteMaxValueThreeTimes(deleteMaxValueThreeTimes(array1)));
    }
}