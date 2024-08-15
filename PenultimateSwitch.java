import java.util.Arrays;

public class PenultimateSwitch {
    public static void switchPenultimate(int[] arr) {
        if (arr != null && arr.length != 0) {
            for (int left = 0; left < arr.length / 2; left++) {
                int right = arr.length - left - 1;
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 4, 7, 3, 54, 88, 32, 65, 43, 23, 10};
        switchPenultimate(array);
        System.out.println(Arrays.toString(array));
    }
}