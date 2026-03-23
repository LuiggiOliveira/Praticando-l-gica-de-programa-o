/*
Crie uma classe chamada Fatura para uma determinada loja. A classe deve conter 4 variáveis: código, descrição,
quantidade de itens comprados, preço por item. A classe deve possuir os métodos get e set para cada variável.
Também deve existir um método chamado getTotalFatura, que retorne o valor total da fatura como um double.
Se o valor de um item não for positivo, ele deve ser configurado como 0. Se o valor da fatura não for positivo,
também deve ser configurado como 0. Escreva uma classe TesteFatura que demonstre as capacidades da classe fatura.
 */

package lista2.questao8;

public class Fatura {
    private int codigo;
    private String descricao;
    private int qtd_itens_comprados;
    private double preco_item;

    //Getters e Setters
    public int getCodigo() { return this.codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getPreco_item() { return this.preco_item; }
    public void setPreco_item(double preco_item) { this.preco_item = preco_item; }

    public int getQtd_itens_comprados() { return qtd_itens_comprados; }
    public void setQtd_itens_comprados(int qtd) { this.qtd_itens_comprados = qtd; }

    public double getTotalFatura(){
        double valorFatura = getPreco_item() * getQtd_itens_comprados();
        if (this.getPreco_item() < 0 || valorFatura < 0) {
            return 0;
        }
        return valorFatura;
    }
}
