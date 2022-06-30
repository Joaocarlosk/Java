public class Cerveja {
    private int codigoCerveja;
    private double preco;
    
    public Cerveja(int c, double p){
        setCodigo(c);
        setPreco(p);
    }

    public void setCodigo(int cod){
        this.codigoCerveja = 1;      //porque tem este this.?
        if (cod>=1 && cod<=5)
        this.codigoCerveja = cod;
    }

    public int getCodigo(){
       return this.codigoCerveja;
       }

    public void setPreco(double pre){
        final double PRECO_MINIMO = 1.99; // o que é o final?
        if (pre>PRECO_MINIMO)
        this.preco = pre;
        else
        this.preco = PRECO_MINIMO;
    }

    public double getPreco(){
        return preco;
    }
}
