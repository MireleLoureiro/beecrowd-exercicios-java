import java.util.Locale;
import java.util.Scanner;

public class media2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double media = (a * 2 + b * 3 + c * 5) / 10;

        System.out.println("MEDIA = " + String.format("%.1f", media));
        sc.close();
    }
}
