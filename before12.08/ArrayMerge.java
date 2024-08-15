import java.util.Arrays;

public class ArrayMerge {
    public static int[] arrayMerging(int[] arr1, int[] arr2) {
        int[] arrayNew = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        for (;i < arrayNew.length;) {
            if (i % 2 == 0) {
                if (j < arr1.length) {
                    arrayNew[i] = arr1[j];
                    j++;
                } 
            } else {
                if (k < arr2.length) {
                    arrayNew[i] = arr2[k];
                    k++;
                } else {
                    arrayNew[i] = arr1[j];
                    j++;
                }
            }
            i++;
        }     
        return arrayNew;
    }
    public static void main(String[] args) {
        int[] array1 = new int[]{6, 34, 234 ,65, 0, -54, -3, 6, 3, 5};
        int[] array2 = new int[]{6, 4, 3, 6, 4, -4};
        System.out.println(Arrays.toString(arrayMerging(array1, array2)));
    }
}