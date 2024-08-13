//118
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OneFromSeveralAndSort {
    public static int[] combineAndSort(int[] ...arr) {
        if (arr == null  || arr.length == 0) {
            throw new IllegalArgumentException("No elements present");
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        int[] newArray = new int[list.size()];
        for (int y = 0; y < newArray.length; y++) {
            newArray[y] = list.get(y).intValue();
        }
        return newArray;  
    }
    public static void main(String[] args) {
        int[] array1 = {3, 6, 4, 43, 66, 55, 32, 98};
        int[] array2 = {123, 6789, 55, 443};
        int[] array3 = {1, 2, 3};
        int[] array4 = {999, 456, 43, 678};
        System.out.println(Arrays.toString(combineAndSort(array1, array2, array3, array4)));
    }
}
