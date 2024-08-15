import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteNegative {
    public static int[] deleteAllNegatives(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            if (element >= 0) {
                list.add(element);
            }
        }
        int[] newArray = new int[list.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = list.get(i).intValue();
        }
        return newArray; 
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{6, 4, 7, -5, 3, -44, 3, 7, 8, -2, -123, 7, -77, 43, -3, -3, -1, 0, 5};
        System.out.println(Arrays.toString(deleteAllNegatives(array1)));
    }
}
