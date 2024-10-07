//101 p.76

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeletionMoreThanTen {
    public static void main(String[] args) {
        int[] array = {43, 1, 3, 5, 2, 5, 8, 89, 65, 2, 32, 12, 3};
        int[] newArray = IntStream.of(array)
            .filter(i -> i >= 10)
            .toArray();
        System.out.println(Arrays.toString(newArray));
    }
}