import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int valorRestante = valor;
        int[] notas = new int[7];
        int[] valoresNota = {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < 7; i++) {
            notas[i] = valorRestante / valoresNota[i];
            valorRestante %= valoresNota[i];
        }

        System.out.println(valor);
        for (int i = 0; i < 7; i++) {
            System.out.println(notas[i] + " notas(s) de R$ " + valoresNota[i] + ",00");
        }
        sc.close();
    }
}
