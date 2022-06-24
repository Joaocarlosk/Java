public class Pessoa {

    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

        public String getNome(){
            return nome;
        }

        public int getIdade(){
            return idade;
        }

        public String setNome(String nome){
            this.nome = nome; 
            return nome;
         }

        public void setIdade(int idade){
            this.idade = idade;
        }       
}