public class Converted {
    public static int kiloIntoMega(int kilo) {
        return (kilo / 1024);
    }

    public static double milesIntoKiloms(int miles) {
        return (miles / 0.6214);
    }

    public static int fahrIntoCels(int fahr) {
        return (int) ((fahr - 32) / 1.8);
    }

    public static void main(String[] args) {
        System.out.println("1000000 kilobytes = " + kiloIntoMega(1000000) + " megabytes");
        System.out.printf("%.2f\n", milesIntoKiloms(15));
        System.out.print("78F = " + fahrIntoCels(78) + "C");
    }
}
