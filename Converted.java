public class Converted {
    public static int kiloIntoMega(int kilo) {
        return (kilo / 1024);
    }

    public static double milesIntoKiloms(int miles) {
        return (miles / 0.6214);
    }

    public static double fahrIntoCels(int fahr) {
        return ((fahr - 32) / 1.8);
    }

    public static void main(String[] args) {
        System.out.println(kiloIntoMega(1000000));
        System.out.printf("%.2f\n", milesIntoKiloms(15));
        System.out.printf("%.2f\n", fahrIntoCels(78));
    }
}
