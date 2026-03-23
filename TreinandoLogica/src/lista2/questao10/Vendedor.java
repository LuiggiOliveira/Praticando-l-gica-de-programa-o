package lista2.questao10;

public class Vendedor extends Empregado {
    private String setorVendas;
    private double valorVendas;

    public Vendedor(String nome, int idade, char sexo, double salario, int matricula, String setorVendas, double valorVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.setorVendas = setorVendas;
    }

    @Override
    public void exibirEmpregadoInfo() {
        System.out.println("\n-- Informações do VENDEDOR --");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.printf("Salario: R$%.2f\n", this.getSalario());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Setor de Vendas: " + setorVendas);
        System.out.printf("Total de vendas: R$%.2f\n", valorVendas);
        System.out.printf("INSS: R$%.2f\n", inss());
    }
}
