//96
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearFromSecondIfIsInFirst {

    public static int[] deleteIfPresent(int[] arr1, int[] arr2) {
        List<Integer> checkList = new ArrayList<>(arr1.length);
        for (int c = 0; c < arr1.length; c++) {
            checkList.add(arr1[c]);
        }
        List<Integer> list = new ArrayList<>(arr2.length);
        for (int l = 0; l < arr2.length; l++) {
            list.add(arr2[l]);
        }
        list.removeAll(checkList);
        int[] newArr = new int[list.size()];
        for (int n = 0; n < newArr.length; n++) {
            newArr[n] = list.get(n);
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 2, 3, 3, 1, 3, 64, 34, 23, 44, 5, 4, 3, 0, 3, 2, 22};
        if (arr1 != null && arr2 != null) {
            System.out.println(Arrays.toString(deleteIfPresent(arr1, arr2)));
        }
    }
}