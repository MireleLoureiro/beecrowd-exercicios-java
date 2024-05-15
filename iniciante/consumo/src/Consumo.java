import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();
        double consumoMedio = x / y;

        System.out.println(String.format("%.3f", consumoMedio) + " km/l");
        sc.close();
    }
}
