package lista2.questao8;

public class TestFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        fatura.setCodigo(12345);
        fatura.setDescricao("Caixa de Chocolates da Garoto");
        fatura.setPreco_item(15.50);
        fatura.setQtd_itens_comprados(6);

        System.out.println("** Exibindo detalhes da fatura ** ");
        System.out.printf("-> Descrição: %s\n",fatura.getDescricao());
        System.out.printf("-> Código: %d\n",fatura.getCodigo());
        System.out.printf("-> Preço por item: R$%.2f\n",fatura.getPreco_item());
        System.out.printf("-> Quantidade: %d\n",fatura.getQtd_itens_comprados());
        System.out.printf("[Total: R$%.2f]",fatura.getTotalFatura());
    }
}
