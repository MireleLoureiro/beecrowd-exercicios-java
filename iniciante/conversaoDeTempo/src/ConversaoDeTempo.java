import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int horas = valor / 3600;
        valor %= 3600;

        int minutos = valor / 60;
        valor %= 30;

        System.out.println(horas + ":" + minutos + ":" + valor);
        sc.close();
    }
}
