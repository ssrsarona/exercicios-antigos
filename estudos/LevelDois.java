package estudos;
import java.util.*;
public class LevelDois {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n = 3.14159D;
        
        double r = sc.nextDouble();

        double area = n*(r*r);
        System.out.printf("A=%.4f\n", area);
        sc.close();
    }
}
