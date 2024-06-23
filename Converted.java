public class Converted {
    public static long kiloIntoMega(long a) {
        int b = 1024;
        return (a / b);
    }

    public static double milesIntoKiloms(int miles) {
        double a = 0.6214;
        return (miles / a);
    }

    public static void main(String[] args) {
        System.out.println(kiloIntoMega(1000000));
        System.out.printf("%.2f", milesIntoKiloms(15));
    }
}
