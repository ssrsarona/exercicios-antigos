package estudos;
import java.util.*;

public class Idade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Informe sua idade: ");
        idade = sc.nextInt();

        if(idade <= 0){
            System.out.println("ERRO! idade invalida!");
            }else{
                if(idade < 18){
                    System.out.println("Voçê é menor de idade!");
                }   else if(idade <= 59) {
                        System.out.println("Voce é um adulto!");
                    }   else {
                            System.out.println("voce é idoso!");
                        }
            } 
    }
}