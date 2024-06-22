public class Random {

    public static void random() {
        int a = (int) (Math.random() * 12);
        //System.out.println(a);
        if(a > 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
    public static void main(String[] args) {
        random();

    }
}