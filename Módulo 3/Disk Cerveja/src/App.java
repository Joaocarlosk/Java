public class App {
    public static void main(String[] args) throws Exception {
        //Criando objeto cerveja e verificando todos os métodos da classe.
        Cerveja ceva1 = new Cerveja(1, 10.00);
        System.out.println("PRIMEIRA CRIAÇÃO DO OBJETO CERVEJA");
        System.out.println(ceva1.getCodigo()); //retorna inteiro
        System.out.printf("%.2f%n%n",ceva1.getPreco()); //retorna double
        ceva1.setCodigo(5);
        ceva1.setPreco(5.00);
        System.out.println("DADOS DO OBJETO CERVEJA ALTERADOS PELOS MÉTODOS GETs");
        System.out.println(ceva1.getCodigo());
        System.out.printf("%.2f%n%n", ceva1.getPreco());

        //Criando objeto cliente e verificando todos os métodos da classe.
        Cliente cli1 = new Cliente("984183158");
        System.out.println("PRIMEIRA CRIAÇÃO DO OBJETO CLIENTE");
        System.out.printf("%.2f%n",cli1.getGastoAcumulado()); //retorna double
        System.out.printf("%d%n%n",cli1.getNumeroDePedidos()); //retorna inteiro
        cli1.fazMaisUmPedido(5.00);
        System.out.println("DADOS DO OBJETO CLIENTE ALTERADOS PELO MÉTODO fazMaisUmPedido");
        System.out.printf("%.2f%n",cli1.getGastoAcumulado()); //retorna double
        System.out.printf("%d%n%n",cli1.getNumeroDePedidos()); //retorna inteiro

        //Criando objeto pedido com o primeiro construtor
        Pedido ped1 = new Pedido(10, cli1, ceva1, 2);
        System.out.println("CRIAÇÃO DO OBJETO PEDIDO");
        System.out.println("Cód. da Ceva "+ceva1.getCodigo()+ "conforme alterado"); 
        System.out.printf("Ceva a %.2f conforme alterado %n",ceva1.getPreco()); 
        System.out.printf("Uma ceva de antes e duas de agora: %.2f%n",cli1.getGastoAcumulado()); 
        System.out.printf("Um pedido de antes mais o de agora: %d%n%n",cli1.getNumeroDePedidos());
        
        //Criando objeto pedido com o segundo construtor
        Pedido ped2 = new Pedido(11, "993696956", ceva1, 5);

       System.out.println(ceva1.getCodigo());
        
        
        
        
        




        





      
    }
}
