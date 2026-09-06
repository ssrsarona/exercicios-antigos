package estudos;
import java.util.*;
public class Lvl60 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] valor = new double[6];
        int contePositivo = 0;
        
        for( int i = 0; i < valor.length; i++ ){
            valor[i] = sc.nextDouble();
            if(valor[i] > 0){
                contePositivo++;
            }
        }
        
        System.out.println(contePositivo + " valores positivos");
        sc.close();
    }
    
}
