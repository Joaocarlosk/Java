import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        Data d = new Data(19, 05, 2011);
        Competicao c = new Competicao("Correr cansa", d);
        System.out.println("Nome da competição: "+c.getNome());
        c.imprimeData();
        Nadador n = new Nadador("Cielo", 23, "borboleta");
        n.imprimeInfo();
        System.out.println();

        Corredor cor = new Corredor("Pedro", 91, 68, c);
        d.setMes(2);
        c.imprimeData();
        System.out.println();

        Data d2 = new Data(01, 01, 2012);
        Competicao c2 = new Competicao("Sâo Silvestre", d2);
        Corredor cor2 = new Corredor("Augosto", 100, 70, c2);
        cor2.imprimeInfo();
        System.out.println();

        Atleta a = null;
        System.out.println("Criar Nadador: digite 1");
        System.out.println("Criar Corredor: digite 2");
        int opcao = le.nextInt();
        if (opcao == 1){
            System.out.print("Digite o nome do nadador: ");
            String nom = le.next();
            System.out.print("Digite a idade do nadador: ");
            int id = le.nextInt();
            System.out.print("Digite a categoria do nadador: ");
            String categ = le.next();
            a = new Nadador(nom, id, categ);
        } else if (opcao == 2){
            System.out.print("Digite o nome do corredor: ");
            String nom = le.next();
            System.out.print("Digite a idade do corredor: ");
            int id = le.nextInt();
            System.out.print("Digite o peso do corredor: ");
            double pes = le.nextDouble();
            a = new Corredor(nom, id, pes, c);
        }

        informacoesAtletas inf = new informacoesAtletas();
        inf.imprimeExclusivoAtleta(a);
        a.imprimeInfo();;

        if (a instanceof Nadador){
            ((Nadador)a).setCategoria("Livre");
            System.out.println(((Nadador)a).getCategoria());
        }else if (a instanceof Corredor){
            ((Corredor)a).setPeso(89);
            System.out.println(((Corredor)a).getPeso());
        }
        
    }
}
