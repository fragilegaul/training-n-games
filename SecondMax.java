import java.util.Arrays;

public class SecondMax {
    public static void findSecondMaxValue(int[] array) {
        Arrays.sort(array);
        int secondMaxValue = array[array.length-2];
        System.out.println(secondMaxValue);     
    }
    
    public static void secMaxValue(int[] array) {
        int max1 = array[0];
        int max2 = array[1];
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max2) {
                max2 = array[i];
            }
            if (max2 > max1) {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
        }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 34, 654, 76, 6723, 4, 5, 4, 43, 42, 6, 67, 2, 4};
        findSecondMaxValue(array);
        secMaxValue(array);
    }
}