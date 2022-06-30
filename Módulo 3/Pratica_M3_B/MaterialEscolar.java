public class MaterialEscolar {
    private int codigo;
    private String nome;
    private double preco;
    private int qtdeEstoque;

    public MaterialEscolar(int cod, String nom, double prec, int qtEstoque){
        codigo = cod;
        nome = nom;
        preco = prec;
        qtdeEstoque = qtEstoque;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQtEstoque(){
        return qtdeEstoque;
    }

    public void setNome(String nom){
        nome = nom;
    }

    public void setPreco(double prec){
        preco= prec;
    }

    public void compraMaterial(int qt){
        qtdeEstoque += qt;
    }

    public void vendeMaterial(int qt){
        qtdeEstoque -= qt;
    }






    
}
