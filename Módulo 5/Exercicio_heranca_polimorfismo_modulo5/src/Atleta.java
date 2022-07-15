public class Atleta {

    private String nome;
    private int idade;

    public Atleta(String n, int i){
        nome = n;
        idade = i;
    }

    public Atleta(){
        
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        nome = n;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int i){
        idade = i;
    }

    public void imprimeInfo(){
        System.out.println("Nome do atleta: "+getNome());
        System.out.println("Idade do atleta: "+getIdade());
    }    
}
