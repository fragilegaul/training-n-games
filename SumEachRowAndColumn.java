//164 p.95
public class SumEachRowAndColumn {
    public static void printRowSum(int[][] matrix) {
        int row = 1;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + row + ": " + sum);
            row++;
        }
    }

    public static void printColumnSum(int[][] matrix) {
        int column = 1;
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Sum of column " + column + ": " + sum);
            column++;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{6, 4, 5, 7, 3},
                        {7, 6, 3, -3, 0},
                        {4, 3, 5, -4, 2}};
        printRowSum(matrix);
        printColumnSum(matrix);
    }
}