package estudos;
import java.util.*;
public class Llv38 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("CODIGO      ESPECIFICAÇÃO       PREÇO");
        System.out.println("------------------------------------------------");
        System.out.println("  1        Cachorro Quente     R$ 4.00");
        System.out.println("  2        X-Salada            R$ 4.50");
        System.out.println("  3        X-Bacon             R$ 5.00");
        System.out.println("  4        Torrada simples     R$ 2.00");
        System.out.println("  5        Refrigerante        R$ 1.50");
        System.out.println("------------------------------------------------");
        System.out.print("Escolha: ");
        int op = sc.nextInt();
        System.out.println("------------------------------------------------");
        System.out.print("Quantas unidades: ");
        int uni = sc.nextInt();
        System.out.println("------------------------------------------------");
        double preco = 0.00;
        
        switch (op) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
        }
        double total = preco * uni;
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
