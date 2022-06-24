public class Cofrinho {

    private Pessoa dono;
    private int qt50;
    private int qt25;
    private int qt10;

    public Cofrinho(Pessoa primeirodono){
        this.qt50 = 0;
        this.qt25 = 0;
        this.qt10 = 0;
        this.dono = primeirodono;
    }

    public Cofrinho(String nome, int idade){
        this.qt50 = 0;
        this.qt25 = 0;
        this.qt10 = 0;
        dono = new Pessoa(nome, idade);
    }

    public Cofrinho(Pessoa segundodono, int q50, int q25, int q10){
        dono = segundodono;
        qt50 = q50;
        qt25 = q25;
        qt10 = q10;

    }

    public Pessoa getDono(){
        return dono;
    }

    public void setDono(Pessoa novodono){
        dono = novodono;
    }

    public void depositaUmaMoedaDezCentavos(){
        qt10 = qt10 + 1;
    }

    public void depositaUmaMoedaVinteCincoCentavos(){
        qt25 = qt25 + 1;
    }

    public void depositaUmaMoedaCinquentaCentavos(){
        qt50 = qt50 + 1;
    }

    public double calculaTotal(){
        double calculaTotal;
        calculaTotal = (qt10 * 0.10) + (qt25 * 0.25) + (qt50 * 0.50);
        return calculaTotal;
    }

    public void exibeDados(){
        System.out.println(dono.getNome() + " tem um total de " + calculaTotal() + " reais no cofrinho");
    }  

     public void mostraQuantCadaMoedas(){
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(" Moedas 50 centavos: " + qt50);
        System.out.println(" Moedas 25 centavos: " + qt25);
        System.out.println(" Moedas 10 centavos: " + qt10);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$\n");
     } 
    
}
