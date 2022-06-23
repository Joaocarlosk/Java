//Uma determinada disciplina possui apenas 3 avaliações: o trabalho (que vale 10% da nota), a prova (que vale 60% da nota) e o teste (que vale 30% da nota). 
//Crie um programa que pede para o usuário digitar as notas que ele tirou nestas avaliações e imprime na tela a nota final do aluno.

public class Exe7 {
    public static void main(String[] args) {
        double trab = Teclado.leDouble("Digite a nota final do trabalho: ");
        double prova = Teclado.leDouble("Digite a nota final da prova: ");
        double teste = Teclado.leDouble("Digite a nota final do teste: ");
        System.out.printf("Sua nota final é: %.2f", (trab*0.1)+(prova*0.6)+(teste*0.3));
        
    }
    
}
