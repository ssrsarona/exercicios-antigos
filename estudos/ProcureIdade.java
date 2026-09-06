package estudos;
import java.util.*;


public class ProcureIdade {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nome = new String[3];
        int[] idade = new int[3];
        
        for(int i = 0; i < idade.length; i++){
            System.out.println("Informe o nome da " + (i + 1) + " pessoa: ");
            nome[i] = sc.nextLine();
             
            System.out.println("Informe a idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
            
        }

        System.out.println("Qual pessoa voce deseja atualizar: ");
        String nomeProcura = sc.nextLine();
        boolean ache = false;

        for(int i = 0; i < idade.length; i++){
            if(nome[i].equals(nomeProcura)){
                System.out.println("Digite a nova idade: ");
                //int novaIdade = sc.nextInt();
                idade[i] = sc.nextInt();
                System.out.println("Atualizado com sucesso!");
                ache = true;
                System.out.println("NOME: " + nome[i] + "| " + "IDADE: " + idade[i] +  "| " + "INDICE: " + i);
            }
        }
        if(!ache){
            System.out.println("NENHUMA PESSOA ENCONTRADA");

        }
        System.out.println("NOVO  DADO: ");
        
    sc.close();
   } 
}
