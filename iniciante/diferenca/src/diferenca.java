import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diferenca = a * b - c * d;

        System.out.println("DIFERENCA = " + diferenca);
        sc.close();
    }
}
