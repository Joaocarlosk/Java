public class Aluno {
    private int matricula;
    private String nome;
    private double [] notasGA; 
    private int qtdeNotasGA;   
    private double [] notasGB; 
    private int qtdeNotasGB;     

    public Aluno(int mat, String nom, int tamanho){  
        matricula = mat;
        nome = nom;
        notasGA = new double [tamanho];
        notasGB = new double [tamanho];
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int mat){
        matricula = mat;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nom){
        nome = nom;
    }

    public double[] getNotasGA(){
        return notasGA;
    }

    public double[] getNotasGB(){
        return notasGB;
    }

    public void insereNotaGA(double nota){
        if(qtdeNotasGA < notasGA.length){
            notasGA[qtdeNotasGA++] = nota;
        }else{
            System.out.println("Não é possível inserir mais notas do GA");
        }
    }

    public void insereNotaGB(double nota){
        if(qtdeNotasGB < notasGB.length){
            notasGB[qtdeNotasGB++] = nota;
        }else{
            System.out.println("Não é possível inserir mais notas do GB");
        }
    }

    public void exibeDados(){
        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Notas do GA: ");
        for(int i=0; i<qtdeNotasGA; i++){
            System.out.print("["+i+"] "+notasGA[i]+ "\t");
        }
        System.out.println();
        System.out.println("Notas do GB: ");
        for(int i=0; i<qtdeNotasGB; i++){
            System.out.print("["+i+"] "+notasGB[i]+ "\t");
        }
        
    }


}
