public class Teste {

    public static void main(String[] args) {

        Pessoa p1, p2, p3;
        Cofrinho c1, c2, c3;

        p1 = new Pessoa("João", 37);
        p2 = new Pessoa("Sinara", 40);
        p3 = new Pessoa("Jurema", 65);

        c1 = new Cofrinho(p1);
        c1.depositaUmaMoedaCinquentaCentavos();
        c1.depositaUmaMoedaDezCentavos();
        c1.depositaUmaMoedaDezCentavos();
        c1.depositaUmaMoedaVinteCincoCentavos();
        c1.exibeDados();
        c1.mostraQuantCadaMoedas();        

        c2 = new Cofrinho("Sinara", 40);
        c2.depositaUmaMoedaCinquentaCentavos();
        c2.depositaUmaMoedaDezCentavos();
        c2.depositaUmaMoedaVinteCincoCentavos();
        c2.exibeDados();
        c2.mostraQuantCadaMoedas();
        
        c3 = new Cofrinho(p3, 2, 1, 1);
        c3.exibeDados();
        c3.mostraQuantCadaMoedas();
    }    
}
