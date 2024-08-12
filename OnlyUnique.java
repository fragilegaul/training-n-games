//117
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlyUnique {
    public static int[] extractOnlyUniqueElements(int[] arr) {
        List<Integer> list = new ArrayList<>();  
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count < 2) {
                list.add(arr[i]);
            }
        }
        int[] newArr = new int[list.size()];
        for (int n = 0; n < newArr.length; n++) {
            newArr[n] = list.get(n);
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 6, 7, 8, 9, 0, 0};
        System.out.println(Arrays.toString(extractOnlyUniqueElements(array)));
    }
}