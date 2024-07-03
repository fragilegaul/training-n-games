import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays2 {
    public static int[] getAr(List<Integer> list) {
        int[] opAr = new int[list.size()];
        for (int i = 0; i < opAr.length; i++) {
            opAr[i] = list.get(i);
        }
        return opAr;
    }

    public static void opPlus(int[] arr, int[] brr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(brr[i] + arr[i]);
        }
        System.out.println("Operation + \n" + Arrays.toString(getAr(list)));
    }

    public static void opMinus(int[] arr, int[] brr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(brr[i] - arr[i]);
        }
        System.out.println("Operation - \n" + Arrays.toString(getAr(list)));
    }

    public static void opMultip(int[] arr, int[] brr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(brr[i] * arr[i]);
        }
        System.out.println("Operation * \n" + Arrays.toString(getAr(list)));
    }

    public static void opDiv(int[] arr, int[] brr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(brr[i] / arr[i]);
        }
        System.out.println("Operation / \n" + Arrays.toString(getAr(list)));
    }
    
    public static void main(String[] args) {
        int[] ar1 = {5, 7, 8, 5, 3, 6, 8};
        int[] ar2 = {67, 43, 2, 3, 4444, 3, 22};
        opPlus(ar1, ar2);
        opMinus(ar1, ar2);
        opMultip(ar1, ar2);
        opDiv(ar1, ar2);
    }
}