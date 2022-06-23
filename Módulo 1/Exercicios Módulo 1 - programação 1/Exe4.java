//Crie um programa que solicita informações completas do endereço do usuário (como nome da rua, cep, bairro etc.). 
//Depois disto, sem programa deve imprimir na tela as informações do endereço do usuário de forma clara e organizada. 

public class Exe4 {
    public static void main(String[] args) {
        String rua = Teclado.leString("Rua: ");
        String cep = Teclado.leString("CEP: ");
        String bairro = Teclado.leString("Bairro: ");
        String cidade = Teclado.leString("Cidade: ");
        String estado = Teclado.leString("Estado: ");
        String pais = Teclado.leString("País: ");
        
        //Saída com apenas uma linha de comando
        System.out.println("--- DADOS DO USUÁRIO (1) ---");
        System.out.printf("Rua: %s\nCEP: %s\nBairro: %s\nCidade: %s\nEstado: %s\nPaís: %s\n", rua,cep,bairro,cidade,estado,pais);

        //Saída separadas
        System.out.println("--- DADOS DO USUÁRIO (2) ---");
        System.out.print("Rua: ");
        System.out.println(rua);
        System.out.print("CEP: ");
        System.out.println(cep); 
        System.out.print("Bairro: ");
        System.out.println(bairro);   
        System.out.print("Cidade: ");
        System.out.println(cidade);   
        System.out.print("Estado: ");
        System.out.println(estado); 
        System.out.print("País: ");
        System.out.println(pais);   

    }
    
}
