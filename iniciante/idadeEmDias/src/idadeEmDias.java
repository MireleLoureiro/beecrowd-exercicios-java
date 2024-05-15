import java.util.Scanner;

public class idadeEmDias {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int anos = valor / 365;
        valor %= 365;

        int meses = valor / 30;
        valor %= 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(valor + " dia(s)");
        sc.close();
    }
}
