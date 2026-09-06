package estudos;
public class arrayTeste {
    public static void main(String[] args) {
        int[] meuTeste = new int[1000];
    
        int soma = 0;
        for(int i = 1; i <= 1000; i++){
                meuTeste[ i - 1] = i;// loop comeca em 1 e como  o primeiro numeor é na casa 0, ele diminui para comecar na orimeira casa
                soma += 1;
        }   
        System.out.println("Soma dos números de 1 até 1000: " + soma);
    }
}
