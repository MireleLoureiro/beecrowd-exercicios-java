import java.util.Scanner;

public class Disgancia {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        sc.close();
    }
}
