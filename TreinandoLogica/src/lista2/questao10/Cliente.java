package lista2.questao10;

public class Cliente extends Pessoa {
    private double valorDivida;
    private String telefone;

    public Cliente(String nome, int idade, char sexo, String telefone, double valorDivida) {
        super(nome, idade, sexo);
        this.telefone = telefone;
        this.valorDivida = valorDivida;
    }

    public void exibirClienteInfo() {
        System.out.println("\n-- Informações do CLIENTE --");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.printf("Valor da dívida: R$%.2f\n", valorDivida);
        System.out.println("Telefone: " + telefone);
    }
}
