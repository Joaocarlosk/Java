public class Exe6 {
    
    //Crie um programa que pede 5 números inteiros pelo teclado e armazena-os, respectivamente, nas variáveis A, B, C, D e E. Em seguida, faça o que se pede: 
    public static void main(String[] args) {
        int a = Teclado.leInt("Digite o valor de A: ");
        int b = Teclado.leInt("Digite o valor de B: ");
        int c = Teclado.leInt("Digite o valor de C: ");
        int d = Teclado.leInt("Digite o valor de D: ");
        int e = Teclado.leInt("Digite o valor de E: ");

        //sabendo que B e C são respectivamente a base e a altura de um triângulo, imprima a área deste triângulo
        System.out.printf("Área do triângulo: %.2f", (double)(b*c)/2);
        System.out.println("");

        //sabendo que A, B, C e D formam um retângulo, imprima o perímetro deste retângulo
        System.out.printf("Perímetro do retângulo: %d",2*(b+c));
        System.out.println("");

        //sabendo que E é o valor do raio de um determinado círculo, imprima a área deste círculo
        System.out.printf("Área do círculo é : %.2f",3.14*(Math.pow(e, 2)));
    }    
}
