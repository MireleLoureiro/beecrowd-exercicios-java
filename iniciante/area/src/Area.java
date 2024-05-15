import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = a * c / 2;
        double circulo = 3.14159 * Math.pow(c, 2);
        double trapezio = (a + b) * c / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.println("TRIANGULO: " + String.format("%.3f", triangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", circulo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", quadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", retangulo));

        sc.close();
    }
}
