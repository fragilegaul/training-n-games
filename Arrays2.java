import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays2 {
    public static void opPlus(int[] arr, int[] brr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(brr[i] + arr[i]);
        }
        int[] opAr = new int[list.size()];
        for (int i = 0; i < opAr.length; i++) {
            opAr[i] = list.get(i);
        }
        System.out.println("Operation + \n" + Arrays.toString(opAr));
    }
    public static void opMinus(int[] arr, int[] brr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(brr[i] - arr[i]);
        }
        int[] opAr = new int[list.size()];
        for (int i = 0; i < opAr.length; i++) {
            opAr[i] = list.get(i);
        }
        System.out.println("Operation - \n" + Arrays.toString(opAr));
    }
    public static void main(String[] args) {
        int[] ar1 = {5, 7, 8, 5, 3, 6, 8};
        int[] ar2 = {67, 43, 2, 3, 4444, 3, 22};
        opPlus(ar1, ar2);
        opMinus(ar1, ar2);

        
    }
}
