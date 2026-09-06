package estudos;

public class Exeer2 {
    public static void main(String[] args){
        Carro carro = new Carro("HONDA", "HRV", 2026);
        carro.exibir();
    }
}
class Carro{
    private String marca, modelo;
    private int ano;
    
    public Carro(){
        marca = "Desconhecida";
        modelo = "Desconhecido";
        ano = 0;
     }
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
     }
    public Carro(String marca, String modelo, int ano){ 
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibir(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
    }
}