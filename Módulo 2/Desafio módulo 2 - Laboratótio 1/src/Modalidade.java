public class Modalidade
{
    private String modalidade;
    private String polo;
    private String curso;
    private char turno;
    
    //Construtor
    public Modalidade (String m, String p, String c, char t){
        modalidade = m;
        polo = p;
        curso = c;
        turno = t;
    }
    
    //Setters
    public void setModalidade (String modalidade){
        this.modalidade = modalidade;
    }
    public void setPolo (String polo){
        this.polo = polo;
    }
    public void setCurso (String curso){
        this.curso = curso;
    }
    public void setTurno (char turno){
        this.turno = turno;
    }
    
    //Getters
    public String getModalidade (){
        return modalidade;
    }
    public String getPolo (){
        return polo;
    }
    public String getCurso (){
        return curso;
    }
    public char getTurno (){
        return turno;
    }
    
    //Métodos
    public void exibeDados (){
        System.out.println("Cadastro de modalidade");
        System.out.println("Modalidade: " + getModalidade());
        System.out.println("Polo: " + getPolo());
        System.out.println("Curso: " + getCurso());
        System.out.println("Turno: " + getTurno());
    }
}