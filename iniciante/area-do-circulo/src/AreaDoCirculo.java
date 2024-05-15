import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double n = 3.14159;
        double area = n * (Math.pow(raio, 2));

        System.out.println("A=" + String.format("%.4f", area));
        sc.close();
    }
}
