import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class QuadratischenEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a != 0) {
            double rootSign = (b * b) - (4 * a * c);
            if (rootSign < 0) {
                System.out.println("There are no roots...");
                scanner.close();
            } else if (rootSign == 0) {
                double r1 = -b / (2 * a);
                if (r1 % 1 != 0) {
                    System.out.println(r1);
                } else {
                    System.out.printf("%.0f", r1);
                    scanner.close();
                }
            } else {
                double r2 = (-b + sqrt(rootSign)) / (2 * a);
                double r3 = (-b - sqrt(rootSign)) / (2 * a);
                System.out.println(r2 + " " + r3);
            }
        }
        scanner.close();
    }
}