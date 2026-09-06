package estudos;
import java.util.*;
public class MyorMynor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        int[] monster = new int[5];
        

        System.out.print("informe o numero: ");
        monster[0] = sc.nextInt();

        int menor = monster[0];
        int maior = monster[0];

        for(int i = 1; i < monster.length; i++){
            System.out.print("informe o numero " + (i + 1) + ": ");
            monster[i] = sc.nextInt();

            if(monster[i] < menor){
                menor = monster[i];
            }
            if(monster[i] > maior){
                maior = monster[i];
            }
        }
        System.out.println("---------------");
        for(int i = 0; i < monster.length; i++){ System.out.println(monster[i]); }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
