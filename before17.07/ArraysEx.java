public class ArraysEx {
    public static boolean compareTwoDArr(int[][] arr1, int[][] arr2) {
        if(arr1 == arr2) {
            return true;
        }
        if(arr1 == null || arr2 == null) {
            return false;
        }
        if(arr1.length != arr2.length) {
            return false;
        }
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i].length != arr2[i].length) {
                return false;
            }
            for(int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrixA = {
            {6, 4, 3},
            {8, 3, 2},
            {8, 4, 3},
        };

        int[][] matrixB = {
            {6, 4, 3},
            {8, 3, 2},
            {8, 4, 3},
        };

        int[][] matrixC = {
            {8, -5, 3},
            {0, 5, 1},
            {-1, 4, 5},
        };

        boolean b1 = compareTwoDArr(matrixA, matrixB);
        boolean b2 = compareTwoDArr(matrixA, matrixC);

        if(b1) {
            System.out.println("Matrix A and Matrix B are equal");
        } else {
            System.out.println("Matrix A and Matrix B are NOT equal");
        }

        if(b2) {
            System.out.println("Matrix A and Matrix C are equal");
        } else {
            System.out.println("Matrix A and Matrix C are NOT equal");
        }
    }
}