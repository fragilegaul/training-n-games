//161 p.92
public class ScalarMatrixMultiplication {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{6, 7, 6},
                        {0, -5, 43},
                        {-5, 7, 5}};
    
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        int multiplier = 3;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j] * multiplier;
            }
        }
        printMatrix(newMatrix);
    }
}