//Crie um programa que pede 5 números inteiros pelo teclado e imprime as seguintes informações:
//– a soma de todos os números 
//– o produto de todos os números

public class Exe5 {
    public static void main(String[] args) {
        int n1 = Teclado.leInt("Digite o 1º número: ");
        int n2 = Teclado.leInt("Digite o 2º número: ");
        int n3 = Teclado.leInt("Digite o 3º número: ");
        int n4 = Teclado.leInt("Digite o 4º número: ");
        int n5 = Teclado.leInt("Digite o 5º número: ");
        System.out.printf("A soma de todos os números é: %d\n",n1+n2+n3+n4+n5);
        System.out.printf("O produto de todos os números é: %d",n1*n2*n3*n4*n5);
        
        System.out.println("");
        System.out.println("");         
        // outra maneira
        System.out.println("A soma de todos os números é: "+(n1+n2+n3+n4+n5));
        System.out.print("O produto de todos os números é: "+n1*n2*n3*n4*n5);

    }
}
