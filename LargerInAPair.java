import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargerInAPair {

    public static int[] deleteLargerInAPair(int[] arr) {
        List<Integer> list = new ArrayList<>();
        if (arr.length % 2 == 0 && arr != null) {
            for (int i = 0; i < arr.length; i+=2) {
                if ((arr[i] + arr[i+1]) < 20) {
                    if (arr[i] > arr[i+1]) {
                        list.add(arr[i+1]);
                    } else {
                        list.add(arr[i]);
                    }
                } else {
                    list.add(arr[i]);
                    list.add(arr[i+1]);
                }
            }
        } else {
            throw new IllegalArgumentException("The amount of elements should be even");
        }
        int[] newArray = new int[list.size()];
        for (int j = 0; j < newArray.length; j++) {
            newArray[j] = list.get(j).intValue();
        }
        return newArray;
    }
    public static void main(String[] args) {

        int[] array = new int[]{3, 41, 0, 5, -10, 121, -11, 4, 7, 9, 0, 237};
        System.out.println(Arrays.toString(deleteLargerInAPair(array)));
    }
}
