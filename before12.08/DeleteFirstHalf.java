import java.util.Arrays;
//89
public class DeleteFirstHalf {

    public static int[] deleteHalfOfArray(int[] arr) {
        int length = arr.length;
        if (arr != null && length % 2 == 0) {
            int startOfNewArray = length / 2;
            int[] newArr = new int[startOfNewArray];
            System.arraycopy(arr, startOfNewArray, newArr, 0, startOfNewArray);
            return newArr;
        } else {
            throw new IllegalArgumentException("The length of the array is not even or is empty.");
        }
    }

    public static void main(String[] args) {
        int[] array = {345, 34, 2, 7, 5, 0, 43, 23, 4, 6, 78, 54};
        System.out.println(Arrays.toString(deleteHalfOfArray(array)));
    }
}
