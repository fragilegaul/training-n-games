//116
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitNumbersIntoDigits {
    public static void main(String[] args) {
        int[] array = {1, 22, 345, 234523456, 34532, 854, 456546, 77543, 2345234, 2345, 3245, 2, 47376, 345};
        List<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            String number = String.valueOf(num);
            for(int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                arrayList.add(j);
            }
        }
        int[] newArray = arrayList.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

        System.out.println(Arrays.toString(newArray));
    }
}