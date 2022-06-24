public class App {
    public static void main(String[] args){
        Cliente cliente1, cliente2, cliente3;
        Imovel imovel1, imovel2, imovel3;
        Aluguel aluguel1, aluguel2, aluguel3;

        cliente1 = new Cliente(1, "João", "(51)98418.3158");
        cliente2 = new Cliente(2, "Sinara", "(51)99369.6956");
        cliente3 = new Cliente(3, "Jurema", "(51) 99999.9999");

        imovel1 = new Imovel(1, "Quarto", 100.00, 10);
        imovel2 = new Imovel(2, "Suíte", 150.00, 5);
        imovel3 = new Imovel(3, "Duplex", 200.00, 2);

        aluguel1 = new Aluguel(1, "01/01/2022", "31/01/2022", imovel1, cliente1);
        aluguel2 = new Aluguel(2, "01/02/2022", "28/02/2022", imovel2, cliente2);
        aluguel3 = new Aluguel(3, "01/03/2022", "31/03/2022", imovel3, cliente3);

        aluguel1.exibeDados();
        System.out.println();
        aluguel2.exibeDados();
        System.out.println();
        aluguel3.exibeDados();
    }
}
