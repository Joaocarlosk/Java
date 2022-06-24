public class Teste {
    public static void main(String[] args){
        Pessoa p1, p2, p3, p4; //declarando o variável-objeto
        Endereco e1, e2, e3; //declarando o variável-objeto
        Data d1, d2, d3, d4; //declarando o variável-objeto
        
        //chamando o construtor da classe Endereco
        //Endereco(String rua,int numero,String cidade,String cep,String bairro,String estado)
        e1 = new Endereco("Piratini",12,"POA","90010-100","Centro","RS");
        e2 = new Endereco("Assis Brasil",345,"POA","91010-100","Assis","RS");
        e3 = new Endereco("Itaparica", 75, "Gravataí", "94100-540", "Neópolis", "RS");
        
        //chamando o construtor da classe Data
        //Data(int d, int m, int a)
        d1 = new Data(25, 06, 1988);
        d2 = new Data(12, 04, 1975);
        d3 = new Data(30, 10, 1982);
        d4 = new Data(07, 04, 1984);
        
        //chamando o construtor da classe Pessoa
        //Pessoa(String n, char s, Data d, Endereco e)
        p1 = new Pessoa("Ana",'F', d1, e1); //instanciando/criando o objeto p1
        p1.exibeDados();
        
        p2 = new Pessoa("Everton", 'M', d2, e2); 
        p2.exibeDados();
        e2.setNumero(335); //alterar o numero do Endereco e2
        p2.exibeDados();
        
        p3 = new Pessoa("Maria", 'F', d3, e2); 
        p3.exibeDados();  
        
        p4 = new Pessoa("João", 'M', d4, e3);
        p4.exibeDados();
    }
}
