public class informacoesAtletas {
    
    public void imprimeExclusivoAtleta(Atleta a){
        if (a instanceof Nadador){
            System.out.println("É um nadador e sua categoria é "+((Nadador)a).getCategoria());
        } else if (a instanceof Corredor){
            System.out.println("É um corredor, e o peso deste corredor é "+((Corredor)a).getPeso());
        }
    }

    public void imprimeInformacoes(Atleta a){
        a.imprimeInfo();
    }
}


