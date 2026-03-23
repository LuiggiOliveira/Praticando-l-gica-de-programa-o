/*
Crie uma classe Data que inclui três variáveis de instância: dia, mês e ano. As variáveis devem ser encapsuladas.
O construtor deve assumir que os valores fornecidos são corretos. Forneça um método imprimiData que exibe a data no
formato dia/mês/ano. Escreva um aplicativo chamado TestData que demonstre as funcionalidades da classe Data.
 */

package lista2.questao3;

public class Data {
    private final int dia, mes, ano;
    public static int contador; //eu quero que só exista um contador para a classe toda

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        contador++; //toda vez que eu criar um objeto do tipo Data, incrementa
    }

    public void imprimiData(){;
        System.out.printf("%d° Data: %d/%d/%d\n",contador,dia,mes,ano);
    }

    public String getDate(){
        return String.format("%02d/%02d/%d",dia,mes,ano);
    }
    /*
    OBSERVAÇÕES:
    1. getDate é só para ser utilizado na questao4 ou nas outras seguintes caso precise ;
    2. E eu sei que eu poderia só utilizar a anterior, mas quis manter o contador na outra e nessa sem ele;
    3. "getData" poderia confundir como "obterDado", enfim, só detalhe de nomenclatura já que estou misturando português com inglês; e
    4. Ao invés de usar o printf eu quero usar String.format() pra retornar diretamente a data para outra parte do sistema
     */
}
