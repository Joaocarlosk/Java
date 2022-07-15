public class Corredor extends Atleta{
    
    private double peso;
    private Competicao competicao;

    public Corredor(String nome, int idade, double peso, Competicao competicao){
        super(nome, idade);
        this.peso = peso;
        this.competicao = competicao;
    }


    public double getPeso(){
        return peso;
    }

    public void setPeso(double p){
        peso = p;
    }

    public Competicao getCompeticao(){
        return competicao;
    }

    public void setCompeticao(Competicao c){
        competicao = c;
    }

    public void imprimeCompeticao(){
        System.out.println("Competição: "+competicao.getNome());
        competicao.imprimeData();
    }

    public void imprimeInfo(){
        System.out.println("Nome do corredor: "+getNome());
        System.out.println("Idade do corredor: "+getIdade());
        System.out.println("Peso do corredor: "+getPeso());
        imprimeCompeticao();
    }
}
