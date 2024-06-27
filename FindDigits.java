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

    public static int findSumFirstAndLast(int a) {
        return (findFirst(a) + findLast(a));
    }

    public static void main(String[] args) {
        int num = 229345;
        System.out.println("The first digit is: " + findFirst(num) + " and the last one is: " + findLast(num));

        int num1 = 45678;
        System.out.println("The sum of the fist and last digits is: " + findSumFirstAndLast(num1));
    }
}
