public class Laboratorio {
    private int sala;
    private String professorResponsavel;
    private String disciplina;
    private int capacidadeMaxima;

    public Laboratorio(int sala, String professorResponsavel, String disciplina, int capacidadeMaxima) {
        this.sala = sala;
        this.professorResponsavel = professorResponsavel;
        this.disciplina = disciplina;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void exibeLaboratorio() {
        System.out.println("==========LABORATÓRIO==========");
        System.out.println("Número da sala: " + getSala());
        System.out.println("Professor Responsável: " + getProfessorResponsavel());
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Capacidade Máxima: " + getCapacidadeMaxima());
    }
}
