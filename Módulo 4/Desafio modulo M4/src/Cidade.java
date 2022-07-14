public class Cidade{
    private int codigo;
    private String descricao;
    private String uf;
    private int qtEstudantes;
    
    public Cidade(int cod, String descr, String uf){
        codigo = cod;
        descricao = descr;
        this.uf =uf;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getUf(){
        return uf;
    }

    public void setDescricao(String desc){
        descricao = desc;
    }

    public void setUf(String uf){
        this.uf = uf;
    }

    public void adicionaNovoEstudante(){
        qtEstudantes += 1;
    }

    public void exibeDados(){
        System.out.printf("\n--- INFORMAÇÕES DA CIDADE ---\n");
        System.out.println("Código: " + codigo);
        System.out.println("Cidade: " + descricao);
        System.out.println("Estado: " + uf);
    }

 
}