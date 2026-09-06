package estudos;
import java.util.*;

public class CaixaEle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int op;
        String[] historico = new String[10];
        int contador = 0;

        do{

            System.out.println("***********************");
            System.out.println("CAIXA ELETRONICO");
            System.out.println(" 1 - Saldo");
            System.out.println(" 2 - Depositar");
            System.out.println(" 3 - Sacar");
            System.out.println(" 4 - Historico");
            System.out.println(" 0 - sair");
            System.out.println("***********************");
            System.out.print("Opcao: ");
            op = sc.nextInt(); 

            if(op == 0){

                System.out.println("Saindo...");
                System.out.println(" ");

            }else if( op == 1){

                System.out.println("Saldo em Conta: " + saldo);
                System.out.println(" ");
            }else if( op == 2){

                System.out.println("Valor do Deposito: (apenas valores inteiro): ");
                int deposito = sc.nextInt();

                    if(deposito > 1){

                        System.out.println("Operacao realizada com sucesso!");
                        saldo += deposito;

                        if( contador <= 9){
                            historico[contador] = "Deposito: " + deposito;
                            contador++;
                        }
                      
                    }else{
                        System.out.println(" deposito deve ser superior a 2 reais");
                    }
                    

            }else if( op == 3){

                System.out.print("Valor do saque: ");
                int saque = sc.nextInt();

                    if(saque <= saldo && saque > 1){

                        System.out.println("Operacao realizada com sucesso");
                        saldo -= saque;
                        if(contador <= 9){
                            historico[contador] = "Saque: " + saque;
                            contador++;
                        }

                    }else{ System.out.println("saldo insuficiente ou invalido!"); }

            }else if( op == 4){
                System.out.println("HISTORICO");
                for(int i = 0; i < contador; i++){
                    System.out.println( historico[i]);

                }
            }

        }while(op != 0);
        sc.close();
    }
}
