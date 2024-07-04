import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays3 {
    public static int[] insertNine(int[] arr, int ins) {
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
           ls.add(arr[i]);                
        }
        List<Integer> newLs = new ArrayList<>();
        for(int i = 0; i < ls.size(); i++) {
            if(ls.get(i) == 4) {
                newLs.add(ins);
                newLs.add(ls.get(i));
                newLs.add(ins);
            } else {
                newLs.add(ls.get(i));
            }
        }
        int[] newAr = new int[newLs.size()];
        for (int i = 0; i < newAr.length; i++) {
            newAr[i] = newLs.get(i);
        }
        return newAr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 4, 8, 234, 6, 35, 234, 4, 6, 7, 9, 6, 6, 4, 5, 2, 5, 7, 3, 2, 4, 1, 3, 7};
        System.out.println(Arrays.toString(insertNine(arr, 9)));
    }
}