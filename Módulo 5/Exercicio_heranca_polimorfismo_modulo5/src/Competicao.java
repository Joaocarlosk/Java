public class Competicao {
    
    private String nome;
    private Data data;

    public Competicao(String n, Data d){
        nome = n;
        data = d;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void imprimeData(){
        System.out.print("Data da competição: ");
        System.out.println(data.getDia()+"/"+data.getMes()+"/"+data.getAno());
    }

    
}
