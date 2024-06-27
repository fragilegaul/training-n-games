public class FindDigits {
    public static int findFirst(int a) {
        int fD = 0;
        while (a != 0) {
            fD = a % 10;
            a /= 10;
        }
        return fD;
    }

    public static int findLast(int a) {
        return a % 10;
    }

    public static void main(String[] args) {
        int num = 229345;
        System.out.println("The first digit is: " + findFirst(num) + " and the last one is: " + findLast(num));
    }
}
