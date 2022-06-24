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
    
//método de configuração de valor para o atributo: modeloProcessador
    public void setModeloProcessador(String mod){
        modeloProcessador = mod;
    }

//método de acesso ao valor do atributo: modeloProcessador
    public String getModeloProcessador(){
        return modeloProcessador;
    }

//método de configuração de valor para o atributo: capacidadeProcessador
    public void setCapacidadeProcessador(double cap){
        capacidadeProcessador = cap;
    }

//método de acesso ao valor do atributo: capacidadeProcessador
    public double getCapacidadeProcessador(){
        return capacidadeProcessador;
    }

//método de configuração de valor para o atributo: quantidadeMemoriaRAM
    public void setQuantidadeMemoriaRAM(int qua){
        quantidadeMemoriaRAM = qua;
    }

//método de acesso ao valor do atributo: quantidadeMemoriaRAM
    public int getQuantidadeMemoriaRAM(){
        return quantidadeMemoriaRAM;
    }

//método de configuração de valor para o atributo: tamanhoHD
    public void setTamanhoHD(int tam){
        tamanhoHD = tam;
    }

//método de acesso ao valor do atributo: tamanhoHD
    public int getTamanhoHD(){
        return tamanhoHD;
    }

//método exibe dados 
    public void exibeDados(){
        System.out.printf("Modelo do processador: %s%n Capacidade do processador: %.1f%n Quantidade Memória RAM: %d%n Tamanho HD: %d%n", modeloProcessador, capacidadeProcessador, quantidadeMemoriaRAM, tamanhoHD);
    }
}