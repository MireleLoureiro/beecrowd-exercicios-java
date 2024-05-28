import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicio < horaFinal) {
            duracao = horaFinal - horaInicio;
        } else if (horaInicio > horaFinal) {
            duracao = (24 - horaInicio) + horaFinal;
        } else {
            duracao = 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}
