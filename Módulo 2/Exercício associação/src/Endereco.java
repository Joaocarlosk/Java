public class Endereco
{
    //atributos da classe
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private String cep;
    private String bairro;
    
    //costrutor da classe
    public Endereco(String rua,int numero,String cidade,String cep,String bairro,String estado)
    {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
    }
    
    //retornar rua
    public String getRua(){
       return rua;
    }
    
    //modifica/alterar/setar rua
    public void setRua(String rua){
       this.rua = rua;
    }
    
    //retornar numero
    public int getNumero(){
       return numero;
    }
    
    //modifica/alterar/setar numero
    public void setNumero(int numero){
       this.numero = numero;
    }
    
    //retornar cep
    public String getCEP(){
       return cep;
    }
    
    //modifica/alterar/setar cep
    public void setCEP(String cep){
       this.cep = cep;
    }
    
    //retornar bairro
    public String getBairro(){
       return bairro;
    }
    
    //modifica/alterar/setar bairro
    public void setBairro(String bairro){
       this.bairro = bairro;
    }
    
    //retornar cidade
    public String getCidade(){
       return cidade;
    }
    
    //modifica/alterar/setar cidade
    public void setCidade(String cidade){
       this.cidade = cidade;
    }
    
    //retornar estado
    public String getEstado(){
       return estado;
    }
    
    //modifica/alterar/setar estado
    public void setEstado(String est){
       estado = est;
    }    
    
    public void exibeDados(){
       System.out.println("Rua " + rua + ", " + numero + " - " + cep);
       System.out.println("Bairro " + bairro + " - " + cidade + " - " + estado);
    }

}