import java.util.Scanner;

public class ExtremamenteBsico {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("X = " + soma);
        sc.close();
    }
}
