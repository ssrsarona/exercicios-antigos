package estudos;
import java.util.*;

public class Procure {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[2];
        int[] idade = new int[2];

        for(int i = 0; i < idade.length; i++){

            System.out.println("Informe  o o nome da " + (i + 1) + " pessoa: ");
            nome[i] = sc.nextLine();
    
            System.out.println("Qual a idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Cadastrado com sucesso!");
            
        }

        
        
        boolean achou = false;

        System.out.println("Qual o nome da pessoa que voce quer procurar: ");
        String nomeProcura = sc.nextLine();
        for(int i = 0; i < idade.length; i++){
            
        
            if(nome[i].equals(nomeProcura)){
                achou = true;
                System.out.println("Nome: " + nome[i]);
                System.out.println("Idade: " + idade[i]);
                System.out.println("Indice: " + i);
                
            }
        }
        if(!achou){
            System.out.println("Nome nao encontrado!");
        }
        sc.close(); 
    }
}
