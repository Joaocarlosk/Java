import java.util.Scanner;

public class TesteTurma {
    public static void main(String[] args){
        Scanner le = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos da turma: ");
        int qt = le.nextInt();
        Turma turma = new Turma(qt);

        char novoAluno = 's';
        do{
            System.out.print("Informe a matrícula do aluno: ");
            int mat = le.nextInt();
            le.nextLine();
            System.out.print("Informe o nome do aluno: ");
            String nom = le.nextLine();
            System.out.print("Informe a quantidade de notas GA e GB do aluno: ");
            int tam = le.nextInt();
            Aluno aluno = new Aluno(mat, nom, tam);
            char opcao = 's';
            do{
                System.out.print("Informe uma nota para o GA: ");
                double ga = le.nextDouble();
                aluno.insereNotaGA(ga);                
                System.out.print("Informe uma nota para o GB: ");
                double gb = le.nextDouble();
                aluno.insereNotaGB(gb);
                System.out.print("Deseja lançar mais notas? (S/N)");
                opcao = le.next().charAt(0);
            }while(Character.toLowerCase(opcao)=='s');
            
            turma.cadastraAluno(aluno);
            System.out.print("Deseja inserir um novo aluno? (S/N");
            novoAluno = le.next().charAt(0);
        }while(Character.toLowerCase(novoAluno)=='s');

        turma.visualizaAlunos();
        
        System.out.println("Informe a matrícula do aluno que deseja visualizar: ");
        int m = le.nextInt();
        turma.pesquisaAluno(m);
    }
}
