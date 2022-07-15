public class Nadador extends Atleta{

    private String categoria;

    public Nadador(String nome, int idade, String categoria){
        super(nome, idade);
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String c){
        categoria = c;
    }

    public void imprimeInfo(){
        super.imprimeInfo();
        System.out.println("Categoria: "+categoria);
    }

}
