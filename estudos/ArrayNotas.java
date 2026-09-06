package estudos;
import java.util.*;
public class ArrayNotas {
    public static void main(String[] args) {

      Locale.setDefault(Locale.US); 
      Scanner sc = new Scanner(System.in);

      double[] notas = new double[5]; 
      double media;
      double soma = 0;
      for(int i = 0; i < notas.length; i++){
            
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            soma += notas[i];
      }

      media = soma/notas.length;

      for(int i = 0; i < notas.length ; i++ ){ System.out.println("Nota " + (i + 1) + ": " + notas[i]); }
            System.out.println("Soma: " + soma);
            System.out.println("Media: " + media);
      sc.close();
  } 
}
