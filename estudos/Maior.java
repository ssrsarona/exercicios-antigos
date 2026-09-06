package estudos;
import java.util.*;
public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        int[] idade = new int[5];
        int cont = 0;
        for(int i = 0; i < idade.length; i++){

            System.out.print("Informe o nome " + (i + 1) + ": ");
            nome[i] = sc.nextLine();
            
            System.out.print("Informe a idade da " + (i + 1) + ": ");
            idade[i] = sc.nextInt();
            sc.nextLine();
            
            System.out.println();  
            
        }
        System.out.println("Maiores de idade: ");
        for(int i = 0; i < idade.length; i++){
            if(idade[i] >= 18){
                System.out.println(nome[i] + " | " + idade[i]);
                cont++;
            }
        }
        System.out.println("Qtd de maiores: " + cont);
        sc.close();
    }  
}
