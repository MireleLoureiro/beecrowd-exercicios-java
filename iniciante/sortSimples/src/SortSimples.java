import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            numeros[i] = sc.nextInt();
        }
        int[] numerosOriginais = Arrays.copyOf(numeros, numeros.length);

        Arrays.sort(numeros);
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println();
        for (int numero : numerosOriginais) {
            System.out.println(numero);
        }
        sc.close();
    }
}