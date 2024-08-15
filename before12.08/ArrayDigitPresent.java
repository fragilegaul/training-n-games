public class ArrayDigitPresent {
    public static int amountPresentInNegative(int[] arr, int checkDigit) {
        int count = 0;
        String s = Integer.toString(checkDigit);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                String st = Integer.toString(arr[i]);
                if (st.contains(s)) {
                    count++;
                }
            }
        }
        return count;
    }  
    
    public static void main(String[] args) {
        int digitToCheck = 5;
        int[] array = new int[]{123, 4, -4, 5, -7, -999, -7, -11, -777, -77, -43, 45, 67, 999, 234, 173, 761};
        System.out.println(amountPresentInNegative(array, digitToCheck));
    }
}
