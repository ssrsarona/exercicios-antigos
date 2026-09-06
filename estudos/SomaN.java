package estudos;

public class SomaN {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        int soma = 0;
        for( int i = 1; i <= 6; i++){
            numeros[i -1] = i; //o array percorre desde do indice 0, para nao dar erro e como o loop calcula apartir de 1, colocamos esse mine calculo para nao dar erro 
            soma++;
        }
        System.out.println("valor da soma é: "+ soma);
    }
}
