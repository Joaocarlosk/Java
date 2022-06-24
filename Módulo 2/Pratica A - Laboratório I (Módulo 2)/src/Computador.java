//assinatura da classe:
//public = identificador da classe, essa classe é pública
//class = identifica a classe
// computador = identifica o nome da classe
public class Computador {
//atributos da classe
    private String modeloProcessador;
    private double capacidadeProcessador;
    private int quantidadeMemoriaRAM;
    private int tamanhoHD;

//construtor
    public Computador(String mod, double cap, int qua, int tam){
        modeloProcessador = mod;
        capacidadeProcessador = cap;
        quantidadeMemoriaRAM = qua;
        tamanhoHD = tam;    
    }   
    
//método exibe dados 
    public void exibeDados(){
        System.out.printf("Modelo do processador: %s%n Capacidade do processador: %.1f%n Quantidade Memória RAM: %d%n Tamanho HD: %d%n", modeloProcessador, capacidadeProcessador, quantidadeMemoriaRAM, tamanhoHD);
    }
}