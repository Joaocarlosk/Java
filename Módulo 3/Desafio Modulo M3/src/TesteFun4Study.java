import java.util.Scanner;

public class TesteFun4Study {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.println("------ CADASTRO DA 1ª CIDADE -------");
        System.out.print("Digite o código da 1ª cidade: ");   
        int cod1 = le.nextInt();
        System.out.print("Digite o nome da 1ª cidade: ");
        String cid1 = le.next();
        System.out.print("Digite o estado da 1ª cidade: ");
        String uf1 = le.next();
        Cidade c1 = new Cidade(cod1, cid1, uf1);
        
        System.out.printf("\n------ CADASTRO DO 1º ESTUDANTE ------\n");
        System.out.print("Digite o código do 1º estudante: ");
        int code1 = le.nextInt();
        System.out.print("Digite o nome do 1º estudante: ");
        String n1 = le.next();
        System.out.print("Digite a data de nascimento do 1º estudante: ");
        String d1 = le.next();
        System.out.print("Digite o email do 1º estudante: ");
        String email1 = le.next();
        System.out.print("Digite a senha do 1º estudante: ");
        String s1 = le.next();
        Estudante e1 = new Estudante(code1, n1, d1, email1, s1, c1);

        System.out.printf("\n------ ALTERAÇÃO DE SENHA DO 1º ESTUDANTE ------ \n");
        System.out.print("Digite a senha do 1º estudante conforme cadastro: ");
        String scadastro = le.next();
        if (scadastro.equals(e1.getSenha())){
            System.out.print("Digite sua nova senha: ");
            String novasenha = le.next();
            System.out.print("Repita nova senha: ");
            String repsenha = le.next();
            if (repsenha.equals(novasenha)){
            e1.setSenha(repsenha);
            System.out.println("Senha alterada com sucesso!");
            }else{
            System.out.println("Não foi possível alterar a senha. Senhas digitas não conferem.");
        }    
        }else{
        System.out.println("Não foi possível alterar a senha. Senha digitada diferente da senha cadastrada.");
        }
        
        System.out.printf("\n------ CADASTRO DO 2º ESTUDANTE ------\n");
        System.out.print("Digite o código do 2º estudante: ");
        int code2 = le.nextInt();
        System.out.print("Digite o nome do 2º estudante: ");
        String n2 = le.next();
        System.out.print("Digite a data de nascimento do 2º estudante: ");
        String d2 = le.next();
        System.out.print("Digite o email do 2º estudante: ");
        String email2 = le.next();
        System.out.print("Digite a senha do 2º estudante: ");
        String s2 = le.next();
        Estudante e2 = new Estudante(code2, n2, d2, email2, s2, c1);

        System.out.printf("\n------ ALTERAÇÃO DE SENHA DO 2º ESTUDANTE ------ \n");
        System.out.print("Digite a senha do 2º estudante conforme cadastro: ");
        String s2cadastro = le.next();
        if (s2cadastro.equals(e2.getSenha())){
            System.out.print("Digite sua nova senha: ");
            String novasenha2 = le.next();
            System.out.print("Repita nova senha: ");
            String repsenha2 = le.next();
            if (repsenha2.equals(novasenha2)){
                e2.setSenha(repsenha2);
                System.out.println("Senha alterada com sucesso!");
            }else{
                System.out.println("Não foi possível alterar a senha. Senhas digitas não conferem.");
            }
        }else{System.out.println("Não foi possível alterar a senha. Senha digitada diferente da senha cadastrada.");
        }

        c1.exibeDados();
        e1.exibeDados();
        e2.exibeDados();

        System.out.println("------ CADASTRO DA 2ª CIDADE -------");
        System.out.print("Digite o código da 2ª cidade: ");   
        int cod2 = le.nextInt();
        System.out.print("Digite o nome da 2ª cidade: ");
        String cid2 = le.next();
        System.out.print("Digite o estado da 2ª cidade: ");
        String uf2 = le.next();
        Cidade c2 = new Cidade(cod2, cid2, uf2);

        System.out.printf("\n------ CADASTRO DO 3º ESTUDANTE ------\n");
        System.out.print("Digite o código do 3º estudante: ");
        int code3 = le.nextInt();
        System.out.print("Digite o nome do 3º estudante: ");
        String n3 = le.next();
        System.out.print("Digite a data de nascimento do 3º estudante: ");
        String d3 = le.next();
        System.out.print("Digite o email do 3o estudante: ");
        String email3 = le.next();
        System.out.print("Digite a senha do 3º estudante: ");
        String s3 = le.next();
        Estudante e3 = new Estudante(code3, n3, d3, email3, s3, c2);

        System.out.printf("\n------ ALTERAÇÃO DE SENHA DO 3º ESTUDANTE ------ \n");
        System.out.print("Digite a senha do 3º estudante conforme cadastro: ");
        String s3cadastro = le.next();
        if (s3cadastro.equals(e3.getSenha())){
            System.out.print("Digite sua nova senha: ");
            String novasenha3 = le.next();
            System.out.print("Repita nova senha: ");
            String repsenha3 = le.next();
            if (repsenha3.equals(novasenha3)){
                e3.setSenha(repsenha3);
                System.out.println("Senha alterada com sucesso!");
            }else{
                System.out.println("Não foi possível alterar a senha. Senhas digitas não conferem.");
            }
        }else{System.out.println("Não foi possível alterar a senha. Senha digitada diferente da senha cadastrada.");
        }

        System.out.printf("\n------ CADASTRO DO 4º ESTUDANTE ------\n");
        System.out.print("Digite o código do 4º estudante: ");
        int code4 = le.nextInt();
        System.out.print("Digite o nome do 4º estudante: ");
        String n4 = le.next();
        System.out.print("Digite a data de nascimento do 4º estudante: ");
        String d4 = le.next();
        System.out.print("Digite o email do 4º estudante: ");
        String email4 = le.next();
        System.out.print("Digite a senha do 4º estudante: ");
        String s4 = le.next();
        Estudante e4 = new Estudante(code4, n4, d4, email4, s4, c2);

        System.out.printf("\n------ ALTERAÇÃO DE SENHA DO 4º ESTUDANTE ------ \n");
        System.out.print("Digite a senha do 4º estudante conforme cadastro: ");
        String s4cadastro = le.next();
        if (s4cadastro.equals(e4.getSenha())){
            System.out.print("Digite sua nova senha: ");
            String novasenha4 = le.next();
            System.out.print("Repita nova senha: ");
            String repsenha4 = le.next();
            if (repsenha4.equals(novasenha4)){
                e4.setSenha(repsenha4);
                System.out.println("Senha alterada com sucesso!");
            }else{
                System.out.println("Não foi possível alterar a senha. Senhas digitas não conferem.");
            }
        }else{System.out.println("Não foi possível alterar a senha. Senha digitada diferente da senha cadastrada.");
        }
        
        c2.exibeDados();
        e3.exibeDados();
        e4.exibeDados();
    }
}


    
