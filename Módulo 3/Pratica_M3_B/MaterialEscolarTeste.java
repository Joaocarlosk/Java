import java.util.Scanner;

public class MaterialEscolarTeste {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        MaterialEscolar m1 = new MaterialEscolar(23, "caneta", 7.50, 20);
        MaterialEscolar m2 = new MaterialEscolar(67, "lapis", 2.50, 50);
        System.out.println("INFORMAÇÕES DO MATERIAL CÓDIGO 23");
        System.out.println("Código: "+ m1.getCodigo());
        System.out.println("Nome: " + m1.getNome());
        System.out.println("Preço: R$" + m1.getPreco());
        System.out.println("Qt. no estoque: " + m1.getQtEstoque());
        System.out.println("");
        m1.vendeMaterial(3);
        System.out.println("Qt. no estoque com venda de 3 canetas: " + m1.getQtEstoque());
        m1.setPreco(2.70);
        System.out.println("Preço da caneta alterado para: R$" + m1.getPreco());
        m1.compraMaterial(10);
        System.out.println("Qt. no estoque com a compra de 10 canetas: " + m1.getQtEstoque());
        
    }
}
