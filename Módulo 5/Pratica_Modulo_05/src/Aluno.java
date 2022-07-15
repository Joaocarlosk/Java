public class Aluno extends Usuario{

    private double notaGA;
    private double notaGB;
    
    public Aluno(int mat, String nom, String log, String sen){
        super(mat, nom, log, sen);
    }

    public double getNotaGA(){
        return notaGA;
    }

    public void setNotaGA(double not){
        notaGA = not;
    }

    public double getNotaGB(){
        return notaGB;
    }

    public void setNotaGB(double not){
        notaGB = not;
    }
    
}
