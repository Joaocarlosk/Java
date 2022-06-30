public class LivroTeste {
    public static void main(String[] args) {
        Livro l1, l2, l3;
        
        l1 = new Livro("Guerra dos mundos");
        l1.empresta();

        l2 = new Livro("O senhor dos anéis");

        l3 = new Livro("A chave mestra");

        l1.exibeDados();
        l2.exibeDados();
        l3.exibeDados();

        
    }
    
}
