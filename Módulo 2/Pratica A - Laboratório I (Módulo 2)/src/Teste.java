public class Teste {
    public static void main(String[] args){
    //declaração de variável objeto
        Computador c1, c2, c3;
    //chamando construtor da classe Computador
    //modeloProcesador, capacidadeProcessador, quantidadeMemoriaRAM, tamanhoHD
        c1 = new Computador("Intel Celeron", 1.5, 512, 80);
        c2 = new Computador("Intel Pentium", 1.5, 256, 40);
        c3 = new Computador("Intel Core", 1.6, 2, 120);

        c1.exibeDados();
        System.out.println();
        c2.exibeDados();
        System.out.println();
        c3.exibeDados();
                
    }
}
