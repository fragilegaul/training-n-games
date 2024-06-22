import java.util.Random;

public class RandomNum {

    public static void random1() {
        int a = (int) (Math.random() * 11);
        System.out.println(a);
        if(a > 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }  
    }

    public static void random2() {
        Random ran = new Random();
        int a = ran.nextInt(10) + 1;
        System.out.println(a);
        if(a > 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
    public static void main(String[] args) {
        random1();
        random2();

    }
}