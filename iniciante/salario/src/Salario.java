import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horasTrabalhas = sc.nextInt();
        double valorPorHora = sc.nextDouble();
        double salario = horasTrabalhas * valorPorHora;

        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));
        sc.close();
    }
}
