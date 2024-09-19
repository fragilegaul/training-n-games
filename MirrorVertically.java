//158
import java.util.Arrays;

public class MirrorVertically {
    public static void main(String[] args) {
        int[][] array = {
            {1},
            {4 , 6} ,
            {5 , 4 , 2} ,
            {9 , 5 , 4 , 7} ,
            {0 , 4 , 3 , 4 , 3} ,
            {4 , 2 , 1 , 5 , 6 , 7} ,
            {5 , 7 , 8 , 4 , 2 , 2 , 3}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                int tmp = array[i][j];
                array[i][j] = array[i][array[i].length - 1 - j];
                array[i][array[i].length - 1 - j] = tmp;
            }
        }

        for (int n = 0; n < array.length; n++) {
            System.out.println(Arrays.toString(array[n]));
        }
    }
}