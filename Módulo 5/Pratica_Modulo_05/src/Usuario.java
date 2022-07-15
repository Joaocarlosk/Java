public abstract class Usuario {

    //atributo comum para todos os usuários
    private int matricula;
    private String nome;
    private String login;
    private String senha;

    //método construtor para todos os usuários
    public Usuario (int mat, String nom, String log, String sen){
        matricula = mat;
        nome = nom;
        login = log;
        senha = sen;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int mat) {
        matricula = mat;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nom){
        nome = nom;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String log){
        login = log;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String sen){
        senha = sen;
    } 
    
    public void exibeDados(){
        System.out.println("");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
    }
}
