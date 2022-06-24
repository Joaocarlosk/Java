public class Pessoa{
    private String nome;
    private char sexo;
    private Data dataNascimento;
    private Endereco endereco;
    
    public Pessoa(String n, char s, Data d, Endereco e){
        nome = n;
        sexo = s;
        dataNascimento = d;
        endereco = e;
    } 
    
    public String getNome(){
        return nome;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public Data getDataNascimento(){
        return dataNascimento;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }   
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
    
    public void setSexo(char novoSexo){
        sexo = novoSexo;
    }
    
    public void setDataNascimento(Data novaDataNascimento){
        dataNascimento = novaDataNascimento;
    }
    
    public void setEndereco(Endereco novoEndereco){
        endereco = novoEndereco;
    }
    
    public void exibeDados(){
       System.out.println("---------------------------------------------");
       System.out.println("Nome: " + nome);
       System.out.println("Sexo: " + sexo);
       dataNascimento.exibeDados();
       endereco.exibeDados();
       System.out.println("---------------------------------------------");
    }
} 