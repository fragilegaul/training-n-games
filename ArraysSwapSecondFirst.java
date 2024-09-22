//140
import java.util.Arrays;

public class ArraysSwapSecondFirst {
    public static void main(String[] args) {
        int[] array1 = {5, 4, 6, 8, 9, 3, 4};
        int[] array2 = {6, 7, 8, 9, 4, 5, 3};

        for (int i = 0, j = 1; j < array2.length; i+=2, j+=2) {
            int temp = array1[i];
            array1[i] = array2[j];
            array2[j] = temp;
            temp = array1[j];
            array1[j] = array2[i];
            array2[i] = temp;
        }
        
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}