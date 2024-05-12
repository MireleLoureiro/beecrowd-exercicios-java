import java.util.Scanner;

public class produtoSimples {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();
        int prod = valorA * valorB;

        System.out.println("PROD = " + prod);
        sc.close();
    }
}
