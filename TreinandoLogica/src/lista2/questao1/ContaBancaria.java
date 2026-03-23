/*
Crie uma classe chamada ContaBancaria, que represente uma conta simples de banco. A classe deve possuir:
 • Um atributo privado para o titular da conta (String).
 • Um atributo privado para o saldo (double).
 • Um método público para definir o titular (set).
 • Um método público para obter o titular (get).
 • Um método público para obter o saldo (get).
 • Um método público depositar(double valor) que aumenta o saldo.
 • Um método público sacar(double valor) que diminui o saldo somente se houver saldo suficiente.

 O programa deverá:
 1. Criar dois objetos de ContaBancaria.
 2. Ajustar titular e valores iniciais via métodos (sem acessar os atributos diretamente).
 3. Realizar depósitos e saques.
 4. Exibir o saldo final de cada conta.
 */

package lista2.questao1;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void depositar(double valor){
        if (valor == 0){
            System.out.println("ERRO!!!: " + titular + " tentou depositar um valor nulo");
            return;
        }
        if (valor < 0){
            System.out.println("ERRO!!!: " + titular + " tentou depositar um valor negativo");
            return;
        }

        this.saldo += valor;
        System.out.println(titular + " depositou " + saldo);
    }

    public void sacar(double valor){ //todo trocar por "Maria Clara sacou/depositou R$1000,00"
        if (valor > 0 && saldo >= valor){
            this.saldo -= valor;
            System.out.println(titular + " sacou " + saldo);
        }
        else if (valor == 0){
            System.out.println("ERRO!!!: " + titular + " tentou sacar um valor nulo");
        }
        else if (valor < 0){
            System.out.println("ERRO!!!: " + titular + " tentou sacar um valor negativo");
        }
        else {
            System.out.println("ERRO!!!: " + titular + " possui um saldo insuficiente para este saque");
        };
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
