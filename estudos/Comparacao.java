package estudos;
import java.util.*;
public class Comparacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, menor, maior, par, impar, primerio;
        par = 0;
        impar = 0;
        maior = 0;
        menor = 0;
        primerio = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Infome o " + (i + 1) + " numero: ");
            n = sc.nextInt();
            

            if( i == 0){
                maior = n;
                menor = n;
            }
            
            if(n >= maior){
                maior = n;
            }else if(n <= menor){
                menor = n;
            }

            if( n % 2 == 0){
                par++;
            }else if (n % 2 != 0){
                impar++;
            }
        }
        System.out.print("\nMaior: " + maior);
        System.out.print("\nMenor: " + menor);
        System.out.print("\nPares: " + par);
        System.out.print("\nImpar: " + impar);
    }
   
}
