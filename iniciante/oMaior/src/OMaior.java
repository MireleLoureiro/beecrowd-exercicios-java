import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        if (c > maiorAB) {
            System.out.println(c + " eh o maior");
        } else {
            System.out.println(maiorAB + " eh o maior");
        }
        sc.close();
    }
}
