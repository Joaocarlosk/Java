public class Cliente {
    private String telefone;
    private double gastoAcumulado;
    private int numeroDePedidos;

    public Cliente(String t){
        telefone = t;
        gastoAcumulado = 0;
        numeroDePedidos = 0;
    }

    public void fazMaisUmPedido(double valor){
        gastoAcumulado += valor;
        numeroDePedidos++;
    }

    public double getGastoAcumulado(){
        return gastoAcumulado;
    }

    public int getNumeroDePedidos(){
        return numeroDePedidos;
    }

    public void zeraNumeroDePedidos(){
        this.numeroDePedidos=0;
    }
}
