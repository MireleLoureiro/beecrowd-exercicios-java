import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int inicioEmMinutos = horaInicial * 60 + minutoInicial;
        int fimEmMinutos = horaFinal * 60 + minutoFinal;
        int duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;

        if (duracaoEmMinutos <= 0) {
            duracaoEmMinutos += 24 * 60;
        }

        int duracaoHoras = duracaoEmMinutos / 60;
        int duracaoMinutos = duracaoEmMinutos % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
                
        sc.close();
    }
}
