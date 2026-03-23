package lista2.questao1;

public class TestContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.setTitular("João Pedro");
        conta2.setTitular("Maria Clara");
        String nome1 = conta1.getTitular();
        String nome2 = conta2.getTitular();

        //saldo1 e saldo2 = 0
        System.out.printf("Saldo atual de %s: %.2f\n",nome1,conta1.getSaldo());
        System.out.printf("Saldo atual de %s: %.2f\n",nome2,conta2.getSaldo());

        //tratando problema de quando deposita valor negativo
        conta1.depositar(1000);
        conta2.depositar(-1000);

        //mensagem de sucesso e mensagem de erro
        System.out.printf("Saldo atual de %s: %.2f\n",nome1,conta1.getSaldo());
        System.out.printf("Saldo atual de %s: %.2f\n",nome2,conta2.getSaldo());

        //dinheiro sacado com sucesso e mensagem de erro de saldo insuficiente
        conta1.sacar(1000);
        conta2.sacar(2000);

        System.out.printf("Saldo atual de %s: %.2f\n",nome1,conta1.getSaldo());
        System.out.printf("Saldo atual de %s: %.2f\n",nome2,conta2.getSaldo());

        //tratando problema de quando saca valor negativo
        conta1.sacar(500);
        conta2.sacar(-500);

        System.out.printf("Saldo atual de %s: %.2f\n",nome1,conta1.getSaldo());
        System.out.printf("Saldo atual de %s: %.2f\n",nome2,conta2.getSaldo());
    }
}
