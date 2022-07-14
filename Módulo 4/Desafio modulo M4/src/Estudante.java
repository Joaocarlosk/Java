public class Estudante {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private Cidade cidade;
    
    public Estudante(int cod, String n, String dtnasc, String email, String s, Cidade cid){
        codigo = cod;
        nome = n;
        dataNascimento = dtnasc;
        this.email = email;
        senha = s;
        cidade = cid;
        cidade.adicionaNovoEstudante();
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getDataNasc(){
        return dataNascimento;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    public Cidade getCidade(){
        return cidade;
    }

    public void setCodigo(int cod){
        codigo = cod;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setDataNasc(String dtnasc){
        dataNascimento = dtnasc;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setSenha(String s){
        senha = s;
    }

    public void setCidade(Cidade cid){
        cidade = cid;
    }

    public void exibeDados(){
        System.out.printf("\n--- INFORMAÇÕES DO ESTUDANTE ---\n");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
        System.out.printf("Senha: %s%n%n", senha);
    }
}