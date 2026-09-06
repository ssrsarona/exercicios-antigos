package estudos;
public class Notas{
    public static void main(String[] args){
        int tamanho = 5;

        double []notas = new double[tamanho];
        notas[0] = 8.5;
        notas[1] = 8.3;
        notas[2] = 0.0;
        notas[3] = 8.0;
        notas[4] = 4.5;

        for(double elemento : notas){
            System.out.println(notas);
              
        }
    }
}