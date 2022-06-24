import javax.sound.midi.Soundbank;

public class Aluguel {

    private int codigo;
    private String datainicio;
    private String datafim;
    private Imovel imovel;
    private Cliente cliente;

    public Aluguel(int codigo, String datainicio, String datafim, Imovel imovel, Cliente cliente){
        this.codigo = codigo;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.imovel = imovel;
        this.cliente = cliente;
    }

    public void exibeDados(){
        System.out.println("DADOS DO ALUGUEL");
        System.out.println("Código do aluguel: " + codigo);
        System.out.println("Data de início da locação: " + datainicio);
        System.out.println("Data do final da locação: " + datafim+"\n");
        imovel.exibeDados();
        System.out.println("\nDADOS DO CLIENTE\nNome do cliente: " + cliente.getNome() + "\nTelefone do cliente: " + cliente.getTelefone());
    }
}
