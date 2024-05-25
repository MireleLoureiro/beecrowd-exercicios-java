import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && c + a > b) {
            double perimetro = a + b + c;
            System.out.println("Perimetro = " + String.format("%.1f", perimetro));
        } else {
            double area = ((a + b) * c) / 2;
            System.out.println("Area = " + String.format("%.1f", area));
        }
        sc.close();
    }
}
