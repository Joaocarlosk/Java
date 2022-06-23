/**
 * Classe Aluno.
 * 
 * @author (João Carlos) 
 * @version (25/02/2022)
 */
public class Aluno
{
   // atributos da classe
   private int matricula;
   private String nome;
   private int semestre;
   
   /**
    * Método Construtor
    */
   public Aluno(int mat,String nom)
   {
       matricula = mat;
       nome = nom;
       semestre = 1;
   }
   
   /**
    * Método aprovado
    * Função: aprova o aluno e altera o semestre do aluno para o próximo semestre
    */
   public void aprovado()
   {
       semestre = semestre + 1;
   }
   
   /**
    * Método exibeDados
    * Função: exibe os dados do aluno
    */
   public void exibeDados()
   {
       System.out.println("Matrícula: " + matricula); 
       System.out.println("Nome: " + nome);
       System.out.println("Semestre: " + semestre);
   } 
}
