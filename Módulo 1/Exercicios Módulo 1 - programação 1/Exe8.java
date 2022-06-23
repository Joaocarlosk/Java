//Uma disciplina possui Grau A e Grau B. 
//A nota do Grau A vale  33% da nota final, enquanto a nota do Grau B vale 67% da nota final. 

//O Grau A possui as seguintes avaliações: 
//– Atividade prática: 45% da nota do Grau A 
//– Atividade teórica: 55% da nota do Grau A 
 
//Já o Grau B possui as seguintes avaliações: 
//– Prova em laboratório: 60% da nota do Grau B 
//– Teste teórico: 20% da nota do Grau B 
//– Trabalho extraclasse: 20% da nota do Grau B 

//Crie um programa que solicite as notas de todas as avaliações e imprime na tela a nota final obtida na disciplina.

public class Exe8 {
    public static void main(String[] args) {
        
        //cálculo Grau A
        double pratGa = Teclado.leDouble("Nota da atividade prática do Grau A: ");
        double teoGa = Teclado.leDouble("Nota da atividade teórica do Grau A: ");
        double ga;
        ga = (pratGa*0.45)+(teoGa*0.55);
        
        //cálculo Grau B
        double provGb = Teclado.leDouble("Nota da prova em laboratório do Grau B: ");
        double testetoGb = Teclado.leDouble("Nota do teste teórico do Grau B: ");
        double trabextraGb = Teclado.leDouble("Nota do trabalho extraclasse do Grau B: ");
        double gb;
        gb = (provGb*0.6)+(testetoGb*0.2)+(trabextraGb*0.2);

        System.out.printf("Sua nota final na disciplina é %.2f", (ga*0.33)+(gb*0.67));        

    }
    
}
