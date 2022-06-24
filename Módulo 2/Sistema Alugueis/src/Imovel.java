public class Imovel {

    private int codigo;
    private String descricao;
    private double precoaluguel;
    private int qtminimaaluguel;

    public Imovel(int codigo, String descricao, double precoaluguel, int qtminimaaluguel){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoaluguel = precoaluguel;
        this.qtminimaaluguel = qtminimaaluguel;
    }

    public void exibeDados(){
        System.out.println("DADOS DO IMÓVEL");
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço aluguel: " + precoaluguel);
        System.out.println("Quantidade mínima de meses para alugar: " + qtminimaaluguel);
    }

    
    
}
