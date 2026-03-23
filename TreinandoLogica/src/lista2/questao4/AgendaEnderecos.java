/*
Crie uma classe AgendaEndereços que deve possuir os seguintes dados de uma pessoa: nome, telefone, data de aniversário
e endereço. Crie os métodos para que essas variáveis possam ser acessadas e modificadas. Crie uma variável que conte a
quantidade de pessoas cadastradas na agenda. Faça uma outra classe para testar a classe agenda de endereços.
 */

package lista2.questao4;

import lista2.questao3.Data;

//todo REUTILIZAR A CLASSE DA QUESTÃO ANTERIOR (DATA) PARA QUE VIRE UM ATRIBUTO DO OBJETO DO TIPO AGENDAENDERECOS!! "Write once run anywhere"
public class AgendaEnderecos {
    private String nome, telefone, endereco;
    private Data dataAniversario; //dataAniversario é atributo de AgendaEnderecos e, ao mesmo tempo, objeto de Data
    private static AgendaEnderecos[] agenda = new AgendaEnderecos[4];
    private static int qtdCadastros;

    //obs: eu preciso criar um objeto do tipo Data primeiro, preenchendo o dia, mês e ano para depois inserir
    //no construtor do objeto de AgendaEnderecos. E isso é bom porque se eu tiver mais de um contato com a mesma data de aniversário,
    //seria só usar o mesmo objeto de Data em todos esses objetos de AgendaEnderecos.

    public AgendaEnderecos(String nome, String telefone, Data dataAniversario, String endereco){
        //evitando erro ArrayIndexOutOfBoundsException
        if (qtdCadastros < agenda.length){
            this.nome = nome;
            this.telefone = telefone;
            this.dataAniversario = dataAniversario;
            this.endereco = endereco;
            agenda[qtdCadastros] = this;
            qtdCadastros++;
        }
        else {
            System.out.println("Erro: Limite da agenda atingido!");
        }
    }

    //todo exibir dados da pessoa, exibir qtd de pessoas cadastradas
    public static void exibirAgendaEnderecos(){
        System.out.println("\n-> Exibindo todos os endereços cadastrados na agenda!");
        for (int i = 0; i < qtdCadastros; i++){
            System.out.printf("%d. Endereço de %s: %s\n", i+1, agenda[i].nome, agenda[i].endereco);
        }
        getTotalCadastros();
    }

    public void exibirInfo(){

        System.out.println("\n* Nome: " + this.nome);
        System.out.println("* Telefone: " + this.telefone);
        System.out.println("* Endereço: " + this.endereco);
        System.out.printf("* Data de aniversário: %s\n", this.dataAniversario.getDate());
    }

    public static void getTotalCadastros(){ //quero usar só como AgendaEnderecos.getTotalCadastros() e não obj.getTotalCadastros()
        System.out.println("-> Total de endereços cadastrados na agenda: " + qtdCadastros);
    }

    //Setters
    public void setNome(String nome){ this.nome = nome;}
    public void setTelefone(String telefone){ this.telefone = telefone;}
    public void setEndereco(String endereco){ this.endereco = endereco;}

}
