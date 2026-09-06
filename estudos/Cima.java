package estudos;
import java.util.*;
public class Cima {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        int[] nd = new int[10];

        double media;
        int soma = 0;
        int contador = 0;
        for(int i = 0; i < nd.length; i++){
            
            System.out.print("Digite um valor " + (i + 1) + ": ");
            nd[i] = sc.nextInt();

            soma += nd[i];
        }
        media = (double) soma/nd.length;

        for(int i = 0; i < nd.length; i++){
            if(nd[i] > media){
                System.out.println(nd[i]);
                contador++;
            }
        }
        System.out.println("Qtd de numeros acima da media: " + contador);

        sc.close();
    }
}
