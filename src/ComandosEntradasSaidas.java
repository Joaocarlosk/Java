public class ComandosEntradasSaidas {
    public static void main(String[] args) {
        System.out.printf("%s%n%d anos%n", "Marcela Silva", 25);
        System.out.printf("%S%n%d anos%n", "Marcela Silva", 25); //imprime a String em letras maiúsculas
        System.out.println();
       
        System.out.printf("%c%n", 'j');
        System.out.printf("%C%n", 'j'); //imprime o caractere em letra maiúscula 
        System.out.println();

        int valor = 123456;
        System.out.printf("%d%n", valor); 
        System.out.printf("%,d%n",valor); //separa por milhagem, depende da configuração de linguagem de seu computador //imprime 123.456
        System.out.println();

        int dia = 1;
        int mes = 5;
        int ano = 2021;
        System.out.printf("%02d/%02d/%d%n", dia, mes, ano); //utilizado para garantir que os valores fiquem alinhados e padronizados
        dia = 21;
        mes = 12;
        ano = 2021;
        System.out.printf("%02d/%02d/%d%n", dia, mes, ano); //utilizado para garantir que os valores fiquem alinhados e padronizados
        //imprime
        //01/12/2021
        //21/12/2021 
        System.out.println();

        double valorFlutuante = 3.145679;
        System.out.printf("%.2f %n",valorFlutuante); //imprime 3.15, ou seja, há arredondamento do valor
        System.out.printf("%.3f %n",valorFlutuante); //imprime 3.146, ou seja, há arredondamento do valor
        System.out.printf("R$%10.2f %n",valorFlutuante); //imprime R$      3,15 
        System.out.printf("R$%010.2f %n",valorFlutuante); //imprime R$0000003,15
        System.out.println();

        int num1 = 10;
        int num2 = 20;
        System.out.printf("Soma das variáveis num1 e num 2 = %d",(num1 + num2));



    






    }
}
