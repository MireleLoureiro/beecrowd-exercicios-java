import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = ((n1 * 2 ) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.println("Media: " + String.format("%.1f", media));

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble(); 
            System.out.println("Nota do exame: " + String.format("%.1f", notaExame));
            double mediaFinal = (media + notaExame) / 2;
            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + String.format("%.1f", mediaFinal));
        }
        sc.close();
    }
}
