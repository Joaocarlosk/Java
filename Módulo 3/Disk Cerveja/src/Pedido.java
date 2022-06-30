public class Pedido {
    private int numero; 
    private Cliente cliente;
    private double valorDoPedido;

    public Pedido(int num, Cliente cli, Cerveja c, int quant){ // cerveja não deveria estar nos
    numero = num;                                                           //atributos?
    cliente = cli;
    valorDoPedido = calculaValorDoPedido(c, quant);
    atualizaDadosCliente();    
    }

    public Pedido(int num, String tel, Cerveja c, int quant){//ñ deveria ser incluido cerv. e qt la 
        this (num, new Cliente(tel), c, quant);             //nos privates?
                                     //É uma maneira de fazer  construção?e o newcliente?
        // this.numero = num;
                //Cliente cli2 = new Cliente(tel);
                //para qual cliente vai este new cliente?

    }

    private double calculaValorDoPedido(Cerveja c, int quant){
        double valor = c.getPreco()*quant; //esse get não tem na classe cliente daí criei
        if (cliente.getGastoAcumulado()>100.00)
        valor = valor - valor*0.1;
        return valor;
    }

    private void atualizaDadosCliente(){
        cliente.fazMaisUmPedido(valorDoPedido);
    }

    public boolean ganhaBrinde(){
        if ((1+(int)(Math.random()*20))%2!=0)
        if (cliente.getNumeroDePedidos()>10){
            cliente.zeraNumeroDePedidos();
            return true;
        }
        return false;
    }    
}
