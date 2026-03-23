package lista2.questao4;

import lista2.questao3.Data;

/*
obs: há algumas coisas a serem avaliadas caso fosse um projeto real, como por exemplo questões de acoplamento forte no construtor,
também eu não coloquei os getters, porque nesse caso achei não necessário, mas em sistemas reais eu deveria já que outras partes
dele usariam os dados. E, por fim, que o exibirAgendaEnderecos() não deveria estar acoplada à entidade para não misturar
lógica de dados com lógica de interface, devendo só retornar os dados
*/

public class TestAgendaEnderecos {
    public static void main(String[] args) {
        Data data1 = new Data(8,1,2004); //PRESTAR ATENÇÃO AQUI PORQUE SE PRECISASSE MUDAR, ACABARIA MUDANDO PRA TODOS
        Data data2 = new Data(12,7,1998); //e sim, eu coloquei "final" considerando que não iria mudar

        AgendaEnderecos item1 = new AgendaEnderecos("Luiggi", "55 (00) 99123-4567", data1, "Brasil, Bahia, Xique-xique, Rua dos Bobos");
        AgendaEnderecos item2 = new AgendaEnderecos("Mario", "55 (01) 99321-7654", data1, "Brasil, São Paulo, Barra Funda, Rua A");
        AgendaEnderecos item3 = new AgendaEnderecos("James Ricardo", "55 (33) 94002-8922", data2, "Brasil, Santa Catarina, Balneário Camboriú, Rua dos Sulistas");

        item1.exibirInfo();
        item2.exibirInfo();
        item3.exibirInfo();

        //testando os getters e o setters
        item1.setNome("Luigi do Mario");
        item1.setTelefone("");
        item1.setEndereco("Jogo do Mario");

        //testando se mudou realmente
        item1.exibirInfo();

        //testando se exibe todos os endereços da agenda
        AgendaEnderecos.exibirAgendaEnderecos();
    }
}
