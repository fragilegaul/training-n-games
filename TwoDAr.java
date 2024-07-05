public class TwoDAr {
    public static void mirrTwoDArVer(int[][] tdar) {
        //traverse each row
        for (int i = 0; i < tdar.length; i++) {  
            //initialise indexes where to start and where to end
            int st = 0;
            int ed = tdar[i].length -1;
            //untill 'start' less then 'end' swap those elements, increment start, decrement end
            while (st < ed) {
                int temp = tdar[i][st];
                tdar[i][st] = tdar[i][ed];
                tdar[i][ed] = temp;
                st++;
                ed--;                
            }
        } 
        for(int i = 0; i < tdar.length; i++) {
            for(int j = 0; j < tdar[i].length; j++) {
                System.out.print(tdar[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1} , {4 , 6}, {5 , 4 , 2}, {9 , 5 , 4 , 7},
            {0 , 4 , 3 , 4 , 3},{4 , 2 , 1 , 5 , 6 , 7} ,
            {5 , 7 , 8 , 4 , 2 , 2 , 3}
        };

        mirrTwoDArVer(arr);
    }
}