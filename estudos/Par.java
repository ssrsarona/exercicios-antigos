package estudos;
import java.util.*;

public class Par {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US); 
    Scanner sc = new Scanner(System.in);

    int[] par = new int[5]; 
    int contador = 0;
        for(int i = 0; i < par.length; i++){
                
                System.out.print("Digite o " + (i + 1) + " numero: ");
                par[i] = sc.nextInt();

                if( par[i] % 2 == 0){
                    contador++;
                }

        }

        System.out.println("Par: ");
        for(int i = 0; i < par.length; i++){
            if( par[i] % 2 == 0){
                System.out.println(par[i]);
            }
        }
        System.out.println("Quantidades de pares: " + contador);
        System.out.println("============");
        System.out.println("Sequencia inserida: ");
        for(int i = 0; i < par.length; i++){
            System.out.println(par[i]);
        }
    }
}
