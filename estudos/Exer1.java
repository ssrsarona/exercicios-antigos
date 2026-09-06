package estudos;
public class Exer1 {
    public static void main(String[] args){
        Produto produto = new Produto("bola", 55, 18.99);
        produto.exibir();
    }
}

class Produto{
    private String nome;
    private int qtd;
    private double preco;
    public Produto(String nome, int qtd, double preco){
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    public void exibir(){
        System.out.println("produto: " + nome);
        System.out.println("quantidade: " + qtd);
        System.out.println("preco: " + preco);
    }
}
