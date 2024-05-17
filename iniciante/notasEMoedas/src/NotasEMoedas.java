import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int valorCentavos = (int) (valor * 100);
        
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1}; 

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = valorCentavos / nota;
            System.out.println(quantidade + " notas(s) de R$ " + String.format("%.2f", nota/100.00));
            valorCentavos %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = valorCentavos / moeda;
            System.out.println(quantidade + " moeda(s) de R$ " + String.format("%.2f", moeda/100.00));
            valorCentavos %= moeda;
        }

        sc.close();
    }
}
