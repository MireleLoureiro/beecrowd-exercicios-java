import java.util.Locale;
import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reajuste;
        int percentual;

        if (salario <= 400.0) {
            percentual = 15;
            reajuste = salario * (percentual / 100.0); 
        } else if (salario <= 800.0) {
            percentual = 12;
            reajuste = salario * (percentual / 100.0);
        } else if (salario <= 1200.0) {
            percentual = 10;
            reajuste = salario * (percentual / 100.0);
        } else if (salario <= 2000.0) {
            percentual = 7;
            reajuste = salario * (percentual / 100.0);
        } else {
            percentual = 4;
            reajuste = salario * (percentual / 100.0);
        }

        double novoSalario = salario + reajuste;
        System.out.println("Novo salario: " + String.format("%.2f", novoSalario));
        System.out.println("Reajuste ganho: " + String.format("%.2f", reajuste));
        System.out.println("Em percentual: " + percentual + " %");

        sc.close();
    }
}
