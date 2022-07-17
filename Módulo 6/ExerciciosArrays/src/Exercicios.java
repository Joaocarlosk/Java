import java.util.Scanner;

public class Exercicios{
    Scanner le = new Scanner(System.in);
    public void exe1a(){
        int [] exe1a = new int[10];
        for(int i=0; i<exe1a.length; i++){
            exe1a[i] = exe1a.length - i;
            System.out.print(exe1a[i]+" ");
        }
    }

    public void exe1b(){
        int[] exe1b = new int[11];
        for(int i=0; i<exe1b.length; i++){
            exe1b[i] = i * i; 
            System.out.print(exe1b[i]+" ");
        }
    }

    public void exe1c(){
        int[] exe1c = new int[10];
        for(int i=0; i<exe1c.length; i++){
            if(i<5){ 
                exe1c[i]=i+1;
                System.out.print(exe1c[i]+" ");
            }else{exe1c[i]=(i-4)*10;
                System.out.print(exe1c[i]+" ");
            }       
        }
    }

    public void exe1d(){
        int[] exe1d = new int[10];
        for(int i=0; i<exe1d.length; i++){
        exe1d[i]= (i*i) + 3;
        System.out.print(exe1d[i]+" ");
        }
    }

    public void exe2(){
        double[] exe2 = new double[5];
        double v;
        for(int i=0; i<exe2.length; i++){
            System.out.print("Valor "+(i+1)+": ");
            v= le.nextDouble();
            exe2[i]=v;
            System.out.println("Valor "+(i+1)+": "+exe2[i]+" ");
        }
    }

    //EXERCICIO 3 PULEI

    public int exe4(int[] array){
        int cont=0;
        for(int i=0; i<array.length; i++)
        if(array[i]%2!=0)
            cont=cont+1;
            return cont;        
    }

    public int exe5(int[] a, int x){
        int cont=0;
        for(int i=0; i<a.length; i++)
        if(a[i] == x)
        cont = cont+1;
        return cont;
    }

    public boolean[] exe6(int [] a){
        boolean [] retorno = new boolean[a.length];
        for(int i=0; i<a.length; i++)
        if(a[i] >= 0)
        retorno[i] = true;
        else retorno[i] = false;
        return retorno;
    }

    public int exe7(double []array){
        int posicaoMaior = 0;
        for(int i=1; i<array.length; i++)
        if(array[i] > array[posicaoMaior])
        posicaoMaior = i;
        return posicaoMaior;
    }

    public double[] exe8(){
        System.out.print("Tamanho do array: ");
        int t = le.nextInt();
        double[] array = new double[t];
        for(int i=0; i<array.length; i++){
            System.out.println("Digite o valor: ");
            array[i] = le.nextDouble();
        }
        return array;
    }

    public void exe9(int[] array){
        for(int i=0; i<array.length; i++){
        if(array[i]%2==0){
            array[i] = 1;
        }else{
            array[i]=-1;
        }
        System.out.print(array[i]+" ");       
        }
    }



}