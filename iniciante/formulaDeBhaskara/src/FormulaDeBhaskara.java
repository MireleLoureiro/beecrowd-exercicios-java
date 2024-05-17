import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double raiz1 = (- b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (- b - Math.sqrt(delta)) / (2 * a);

            System.out.println("R1 = " + String.format("%.5f", raiz1));
            System.out.println("R2 = " + String.format("%.5f", raiz2));
        }
        
        sc.close();
    }
}
