import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] lados = new double[3];
        lados[0] = sc.nextDouble();
        lados[1] = sc.nextDouble();
        lados[2] = sc.nextDouble();

        Arrays.sort(lados);
        double a = lados[2];
        double b = lados[1];
        double c = lados[0];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b  && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b  || b == c || a == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}
