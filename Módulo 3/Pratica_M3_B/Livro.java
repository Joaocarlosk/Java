public class Livro{
    private String titulo;
    private boolean emprestado;

    public Livro(String tit){
        titulo = tit;
        emprestado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String isEmprestado(){
        String empres;
        if (emprestado == true)
        empres = "Emprestado";
        else
        empres = "Disponível";
        return empres;
    }

    public void empresta(){
        emprestado = true;
    }

    public void devolve(){
        emprestado = false;
    }

    public void exibeDados(){
        System.out.println("O título do livro é: " + getTitulo());
        System.out.println("Este livro está: " + isEmprestado()); 
    }
}