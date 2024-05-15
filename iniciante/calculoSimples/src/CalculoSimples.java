import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numeroPecas1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double valorTotal = numeroPecas1 * valorUnitario1 + numeroPecas2 * valorUnitario2;

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorTotal));
        sc.close();
    }
}
