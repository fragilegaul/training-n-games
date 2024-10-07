//112 p.79

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LessThanElementValue {
    public static void main(String[] args) {
        int[] array = {4, 456, 35, 43, 346, 234, 34, 74, 775, 234, 55, 45};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < array.length; j++) {
            if (array[j] < (sum / array.length)) {
                list.add(array[j]);
            }
        }
        int[] newArray = new int[list.size()];
        for (int n = 0; n < list.size(); n++) {
            newArray[n] = list.get(n);
        }
        System.out.println(Arrays.toString(newArray));
    }
}