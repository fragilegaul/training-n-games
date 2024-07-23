import java.util.ArrayList;
import java.util.List;

public class NearNegative {
    public static int sumOfNearNegativeValues(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < array.length-1;) {
            if (array[i] < 0 && array[i-1] < 0 && array[i+1] < 0) {
                list.add(array[i]);
                list.add(array[i-1]);
                list.add(array[i+1]);
            }
            if (array[i] < 0 && array[i-1] >= 0 && array[i+1] < 0) {
                list.add(array[i]);
                list.add(array[i+1]);
            }
            i+=2;
        }  
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            sum += list.get(j);
        }
        return sum;  
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 67, -5, 34, -6, -5, 6, -5, 7, -8, -5, -4};
        int[] arr1 = new int[]{6, 5, 7, -5, -4, 7, 0, -1, 5};
        int[] array2 = new int[]{6, 5, 4, -7, -3, 3, 5, 2, 6, 8, -4, -7, -1};
        System.out.println(sumOfNearNegativeValues(array));
        System.out.println(sumOfNearNegativeValues(arr1));
    }
}