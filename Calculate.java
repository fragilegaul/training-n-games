import java.math.BigInteger;
import java.util.Arrays;

public class Calculate {

    public static int calc1(int a, int b) {
        return (a + b) / 2;
    }

    public static int calc2(int a, int b) {
        return ((a / 2) + (b / 2));
    }

    public static int calc3(int a, int b, int c) {
        return ((a * b) / c);
    }

    public static int maxValue(int a, int b, int c) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        
        System.out.println(calc1(4, 8));
        System.out.println(calc1(1073741824, 1073741833));

        System.out.println(calc2(4, 8));
        System.out.println(calc2(1073741824, 1073741833));

        float a = 1.1f;
        float b = 2.3f;

        System.out.println(a * b);
        System.out.println(a + b);
        System.out.println(b - a);
        
        System.out.println("\n" + calc3(123, 324, 30));

        System.out.println("\n" + maxValue(123, 324, 30));

        double c = 9898989898989L * 9898989898989L;
        System.out.println(c);

        BigInteger a1 = new BigInteger("9898989898989");
        BigInteger a2 = a1;
        BigInteger bI = a1.multiply(a2);
        System.out.println(bI);
    }
}