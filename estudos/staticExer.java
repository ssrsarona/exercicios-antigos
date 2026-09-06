package estudos;

public class staticExer {
    public static void main(String[] args) {
        SalaDeAula al = new SalaDeAula();
        SalaDeAula al2 = new SalaDeAula();
        SalaDeAula al3 = new SalaDeAula();
        SalaDeAula.exibir();
        
    }
}

class SalaDeAula{
    public static int totalAluno = 0; 

    public SalaDeAula() {//se por void ele nao conta, ja  que void nao retorna nada
        totalAluno++; 
    }
    public static void exibir(){
       System.out.println(" total de aluno: " + SalaDeAula.totalAluno);
    }
}
