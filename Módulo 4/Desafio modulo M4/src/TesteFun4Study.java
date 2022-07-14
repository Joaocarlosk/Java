import java.util.Scanner;

public class TesteFun4Study {
public static void main(String[] args) {
Scanner le = new Scanner(System.in);
            
char respCity;
do{
    System.out.println("------ CADASTRO DA CIDADE -------");
    System.out.print("Digite o código da cidade: ");   
    int cod1 = le.nextInt();
    System.out.print("Digite o nome da cidade: ");
    String cid1 = le.next();
    System.out.print("Digite o estado da  cidade: ");
    String uf1 = le.next();
    Cidade c1 = new Cidade(cod1, cid1, uf1);
    c1.exibeDados();
    System.out.println("======================== ATENÇÃO =======================");
    System.out.println("Você precisa cadastrar no mínimo 4 estudantes por cidade.");
    char respStudant='2'; 
    int cont = 1;
    while (respStudant != '0'){
    System.out.printf("\n------ CADASTRO DO %dº ESTUDANTE DA CIDADE %S------\n",cont, c1.getDescricao ());
    System.out.print("Digite o código do estudante: ");
    int code1 = le.nextInt();
    System.out.print("Digite o nome do estudante: ");
    String n1 = le.next();
    System.out.print("Digite a data de nascimento do estudante: ");
    String d1 = le.next();
    System.out.print("Digite o email do estudante: ");
    String email1 = le.next();
    System.out.print("Digite a senha do estudante: ");
    String s1 = le.next();
    Estudante e1 = new Estudante(code1, n1, d1, email1, s1, c1);
    e1.exibeDados();
        
    char respAlteraDado = '0';
    while (Character.toUpperCase(respAlteraDado) != 'S' && Character.toUpperCase(respAlteraDado) != 'N'){
        System.out.println("Deseja alterar algum dado do estudante criado? ");
        System.out.println("Digite (S) pra sim ou (N) para não.");       
        respAlteraDado = le.next().charAt(0);
        if (Character.toUpperCase(respAlteraDado) != 'N' && Character.toUpperCase(respAlteraDado) != 'S'){
            System.out.printf("Você digitou uma opção inválida!\n\n");
        }
    }
        if (Character.toUpperCase(respAlteraDado) == 'S'){
            int choice =0;
            while (choice < 1 || choice >5){
                System.out.println("Qual dado você quer alterar?");
                System.out.println("Digite 1 para código.");
                System.out.println("Digite 2 para nome.");
                System.out.println("Digite 3 para data de nascimento.");
                System.out.println("Digite 4 para email.");
                System.out.println("Digite 5 para senha.");
                choice = le.nextInt();
                if (choice < 1 || choice > 5){
                    System.out.printf("Você digitou uma opção inválida!\n\n");
                }
            }
        switch (choice) {
            case 1:
                System.out.print("Digite o novo código: "); 
                int novoCodigo = le.nextInt();
                e1.setCodigo(novoCodigo);               
                break;
            case 2:
                System.out.print("Digite o novo nome: ");
                String novoNome = le.next();
                e1.setNome(novoNome);
                break;
            case 3:
                System.out.print("Digite a nova data de nascimento: ");
                String novaData = le.next();
                e1.setDataNasc(novaData);
                break;
            case 4:
                System.out.print("Digite o novo email: ");
                String novoEmail = le.next();
                e1.setEmail(novoEmail);
                break;
            case 5:
                int n =0;
                do{
                System.out.print("Digite a senha do estudante conforme cadastro: ");
                String scadastro = le.next();
                if (scadastro.equals(e1.getSenha())){
                    System.out.print("Digite sua nova senha: ");
                    String novasenha = le.next();
                    System.out.print("Repita nova senha: ");
                    String repsenha = le.next();
                if (repsenha.equals(novasenha)){
                    e1.setSenha(repsenha);
                    System.out.println("Senha alterada com sucesso!");
                    n = 1;
                }else{
                    System.out.println("Não foi possível alterar a senha. Senhas digitas Não conferem.");
                }    
                }else{
                    System.out.println("Não foi possível alterar a senha. Senha digitada diferente da senha cadastrada.");
                }               
                }while (n==0);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.printf("\nDADOS DO ESTUDANTE ATUALIZADOS");
        e1.exibeDados();
        cont = cont + 1;
        if (cont > 4){
            System.out.println("Voccê quer cadastar um novo estudante?");
            System.out.println("SIM - Digite 1");
            System.out.println("NÃO - Digite 0");
        respStudant = le.next().charAt(0);
        }
        
        }else{        
            cont = cont + 1;
        if (cont > 4){
            respStudant = '2';
            while (respStudant != '0' && respStudant != '1'){
            System.out.println("Você quer cadastar um novo estudante?");
            System.out.println("SIM - Digite 1");
            System.out.println("NÃO - Digite 0");
            respStudant = le.next().charAt(0);
            if (respStudant != '0' && respStudant != '1'){
                System.out.println("Você digitou uma opção inválida!");
            }
            }
        }
        }
        }
        respCity = '2';
        while (respCity !='0' && respCity !='1'){
            System.out.println("Você quer cadastrar uma nova cidade?");
            System.out.println("SIM - Digite 1");
            System.out.println("NÃO - Digite 0");
            respCity = le.next().charAt(0);
            if (respCity != '0' && respCity != '1'){
            System.out.println("Você digitou uma opção inválida!");
            }
        }
        } while (respCity != '0');
    }
}   
