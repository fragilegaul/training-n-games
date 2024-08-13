//119

import java.util.Arrays;

public class FromOneToTwoDimentions {
    public static int[][] convertArray(int[] arr) {
        int[][] newArr = new int[arr.length][1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i][0] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 34, 435, 32, 4, 6};
        int[][] dimArray = convertArray(array);
        System.out.println(Arrays.deepToString(dimArray));
    }
}
