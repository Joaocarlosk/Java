import java.util.Scanner;

public class PrimeiroExemploHeranca {
    public static void main(String[] args){
        Scanner le = new Scanner (System.in);

        //cria um novo usuário no sistema
        int m;
        String n, l, s;/*
        System.out.print("Matrícula usuário: ");
        m = le.nextInt();
        System.out.print("Nome usuário: ");
        n = le.next();
        System.out.print("Login usuário: ");
        l = le.next();
        System.out.print("Senha usuário: ");
        s= le.next();
        Usuario u = new Usuario(m, n, l, s);*/

        //cria um nono usuário do tipo professor no sistema
        System.out.print("\nMatrícula professor: ");
        m = le.nextInt();
        System.out.print("Nome professor: ");
        n = le.next();
        System.out.print("Login professor: ");
        l = le.next();
        System.out.print("Senha professor: ");
        s= le.next();
        Professor p = new Professor(m, n, l, s);

        //cria um novo usuário do tipo aluno no sistema;
        System.out.print("\nMatrícula aluno: ");
        m = le.nextInt();
        System.out.print("Nome aluno: ");
        n = le.next();
        System.out.print("Login aluno: ");
        l = le.next();
        System.out.print("Senha aluno: ");
        s= le.next();
        Aluno a = new Aluno(m, n, l, s);

        //apresentar a matrícula e o nome de cada usuário criado
        //usuário
        /*System.out.println("\nMatrícula usuário: " + u.getMatricula());
        System.out.println("Nome usuário: " + u.getNome());*/

        //professor
        System.out.println("\nMatrícula professor: " + p.getMatricula());
        System.out.println("Nome professor: " + p.getNome());

        //aluno
        System.out.println("\nMatrícula aluno: " + a.getMatricula());
        System.out.println("Nome aluno: " + a.getNome());


    }
}
