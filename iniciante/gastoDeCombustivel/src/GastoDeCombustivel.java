import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        double distanciaPercorrida = tempoGasto * velocidadeMedia;
        double quantidadeLitros = distanciaPercorrida / 12;

        System.out.println(String.format("%.3f", quantidadeLitros));
        sc.close();
    }
}