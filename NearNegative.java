public class NearNegative {

    public static int sumOfNearNegativeValues(int[] array) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
            counter++; 
            } else {
                counter = 0;
            }
            if (counter == 2) {
                sum += array[i] + array[i-1];    
            }
            if (counter > 2) {
                sum += array[i];
            }
        }
        return sum;  
    }


    public static void main(String[] args) {

        int[] array = new int[]{5, 4, 67, -5, 34, -6, -5, 6, -5, 7, -8, -5, -4};
        int[] arr1 = new int[]{6, 5, 7, -5, -4, 7, 0, -1, 5};
        System.out.println(sumOfNearNegativeValues(array));
        System.out.println(sumOfNearNegativeValues(arr1));
    }
}