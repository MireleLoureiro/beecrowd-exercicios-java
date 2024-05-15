import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double vendasEfetudas = sc.nextDouble();
        double novoSalario = salarioFixo + (0.15 * vendasEfetudas);
        novoSalario = Math.ceil(novoSalario);

        System.out.println("TOTAL = R$ " + String.format("%.2f", novoSalario));
        sc.close();
    }
}
