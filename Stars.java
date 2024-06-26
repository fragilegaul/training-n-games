public class Stars {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++) {
            System.out.println("*");
            if(i >= 5) break;
            for(int j = 0; j < i; j++) {
                System.out.println();    
            }
        }
    } 
}
