import java.util.Locale;
import java.util.Scanner;

public class media1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double media = (a * 3.5 + b * 7.5) / 11;

        System.out.println("MEDIA = " + String.format("%.5f", media));
        sc.close();
    }
}
