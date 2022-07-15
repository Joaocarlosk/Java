public class Professor extends Usuario{

    //atributos específicos para o professor
    private String areaAtuacao;
    
    public Professor(int mat, String nom, String log, String sen){
        //encaminha os parâmetros para o construtor da superclasse = construtor da classe: Usuario
        super(mat, nom, log, sen);
    }   
    
    public String getAreaAtuacao(){
        return areaAtuacao;
    }

    public void setAreaAtuacao(String are){
        areaAtuacao = are;
    }

    public void exibeDados(){
        System.out.println("");
        System.out.println("++++++ Dados do professor ++++++");
        //reaproveitamento das instruções que já existem no método da superclasse
        super.exibeDados(); //esta instrução chama o método exibeDados() da superclasse
        //se a área de atuação for diferente de null e vazio, vamos apresentá-la também
        if(areaAtuacao!=null && !areaAtuacao.isEmpty())
            System.out.println("Área de atuação: " + areaAtuacao);
    }
}
