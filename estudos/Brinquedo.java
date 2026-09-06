package estudos;
import java.util.*;
public class Brinquedo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int idade;
        double altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("informe sua idade: ");
        idade = sc.nextInt();
        
        System.out.print("Informe sua altura: ");
        altura = sc.nextDouble();

        if(idade >= 12 && altura >= 1.60){
            System.out.println("voce pode entrar");
        }else{
            System.out.println("voce nao pode entrar");
        }
    }
}
