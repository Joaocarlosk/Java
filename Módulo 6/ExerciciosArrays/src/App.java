import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Exercicios e = new Exercicios();
        double []d=new double[20];
        Scanner le = new Scanner(System.in);

        /*double [] array = new double[5];
        for(int i=0; i<array.length; i++){
            System.out.print("Digite um número: ");
            array[i]=le.nextInt();
        }
        System.out.println(e.exe7(array));*/
        

        /*System.out.println(e.exe6(array));

        boolean [] teste = new boolean[array.length];
        teste = e.exe6(array);
        System.out.println(teste[1]);*/

        
        /*double[]teste;
        teste = e.exe8();

        for(int i=0; i<teste.length; i++)
        System.out.print(teste[i]+" - ");*/

        int [] array = new int[10];
        for(int i=0; i<array.length; i++){
            System.out.print("Digite um número: ");
            array[i]=le.nextInt();
        }

        e.exe9(array);
    }
}
