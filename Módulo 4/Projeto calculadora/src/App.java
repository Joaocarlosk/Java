import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner le = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao, opcaoparada;
        double num1, num2;
        double resultsoma, resultsub, resultmulti, resultdivi, resulpot;

        do{

            do{
            System.out.println("Digite a opção desejada: ");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Potência");
            opcao = le.nextInt();
            } while (opcao < 1 || opcao > 5);

            switch (opcao){
                case 1:
                    System.out.println("Digite n1: ");
                    num1 = le.nextDouble();
                    System.out.println("Digite n2: ");
                    num2 = le.nextDouble();
                    resultsoma = calc.soma(num1, num2);
                    System.out.printf("SOMA: %.2f ", resultsoma);
                break;

                case 2:
                    System.out.println("Digite n1: ");
                    num1 = le.nextDouble();
                    System.out.println("Digite n2: ");
                    num2 = le.nextDouble();
                    resultsub = calc.subtracao(num1, num2);
                    System.out.printf("SUBTRAÇÃO: %.2f ", resultsub);
                break;

                case 3:
                    System.out.println("Digite n1: ");
                    num1 = le.nextDouble();
                    System.out.println("Digite n2: ");
                    num2 = le.nextDouble();
                    resultmulti= calc.multiplicacao(num1, num2);
                    System.out.printf("MULTIPLICAÇÃO: %.2f ", resultmulti);
                break;

                case 4:
                    do{
                        System.out.println("Digite n1: ");
                        num1 = le.nextDouble();
                        System.out.println("Digite n2: ");
                        num2 = le.nextDouble();
                        if (num1 <= 0 || num2 <=0){
                            System.out.println("Não permitido número negativo!");
                        }
                    } while (num1 <= 0 || num2 <=0);
                    resultdivi = calc.divisao(num1, num2);
                    System.out.printf("DIVISÃO: %.2f ", resultdivi);
                break;

                case 5:
                    System.out.println("Digite n1: ");
                    num1 = le.nextDouble();
                    System.out.println("Digite n2: ");
                    num2 = le.nextDouble();
                    resulpot= calc.potencia(num1, num2);
                    System.out.printf("POTÊNCIA: %.2f ", resulpot);
                break;
            }
            System.out.println("\nDeseja utilizar a calculadora novamente? (0-não, 1-sim)");
            opcaoparada = le.nextInt();
        } while(opcaoparada != 0);

        System.out.println("Finalizando calculadora!");

    }
}
