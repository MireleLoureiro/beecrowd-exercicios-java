import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                break;
        
            case 2:
                total = quantidade * 4.50;
                break;

            case 3:
                total = quantidade * 5.00;
                break;

            case 4:
                total = quantidade * 2.00;
                break;

            case 5:
                total = quantidade * 1.50;
                break;

            default:
                total = 0;
                break;
        }
        
        System.out.println("Total: R$ " + String.format("%.2f", total));
        sc.close();
    }
}
