public class Exe3 {
    public static void main(String[] args) {
    String nome = Teclado.leString("Digite seu nome: ");
    System.out.println(nome);
    double alt = Teclado.leDouble("Digite sua altura: ");
    System.out.println(alt);
    System.out.printf("Obrigado %s pela sua participação!",nome);       
    }
}
