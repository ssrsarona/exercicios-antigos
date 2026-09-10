package poo;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        pessoa.apresentar(sc);
    }
}
class Pessoa{
    public void apresentar(Scanner sc){
        String name;
        int id;
        System.err.println("Qual o nome: ");
        name =  sc.nextLine();
        System.out.println("Qual a idade: ");
        id = sc.nextInt();

        System.out.println("Nome: " + name + " || " + "Idade: " + id);
    }

}