public class Turma {
    
    private Aluno [] alunosDaTurma;
    private int qtdeAlunos;

    public Turma(int tamanho){
        alunosDaTurma = new Aluno[tamanho];
    }

    public int getQtdeAlunos(){
        return qtdeAlunos;
    }

    public void cadastraAluno(Aluno aluno){
        if(qtdeAlunos < alunosDaTurma.length){
            alunosDaTurma[qtdeAlunos++] = aluno;
    } else {
        System.out.println("Não é possível inserir mais alunos na Turma");
    }
    }

    public void visualizaAlunos(){
        for(int i=0; i<qtdeAlunos; i++){
            alunosDaTurma[i].exibeDados();
            System.out.println("");
        }
    }

    public void pesquisaAluno(int matricula){
        boolean localizouAluno = false;        
        for(int i=0; i<qtdeAlunos; i++){
            if(alunosDaTurma[i].getMatricula()==matricula){
                alunosDaTurma[i].exibeDados();
                localizouAluno = true;
                break;
            }
        }
        if(!localizouAluno)
            System.out.println("Aluno não localizado com a matrícula: "+matricula);
    }


}
