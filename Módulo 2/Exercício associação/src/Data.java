public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setDia(int novoDia){
        dia  = novoDia;
    }
    
    public void setMes(int novoMes){
        mes = novoMes;
    }
    
    public void setAno(int novoAno){
        ano = novoAno;
    }
    
    public void exibeDados(){
       System.out.println("Data de Nascimento: " + dia + "/" + mes + "/" + ano);
    }
}