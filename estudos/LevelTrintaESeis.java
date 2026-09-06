package estudos;
import java.util.*;
public class LevelTrintaESeis {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
    
        boolean bMaiorQueC_e_dMaiorQueA = (b > c) && (d > a);
        boolean somaCDMaiorQueSomaAB = (c + d) > (a + b);
        boolean ambosPositivos = (c > 0) && (d > 0);
        boolean aEhPar = (a % 2 == 0);

        
        if (bMaiorQueC_e_dMaiorQueA && somaCDMaiorQueSomaAB && ambosPositivos && aEhPar) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();
    }
    
}
