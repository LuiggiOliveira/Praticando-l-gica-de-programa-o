package lista2.questao10;

public class Gerente extends Empregado {
    private String setorGerencia;

    public Gerente(String nome, int idade, char sexo, double salario, int matricula, String setorGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.setorGerencia = setorGerencia;
    }

    @Override
    public void exibirEmpregadoInfo() {
        System.out.println("\n-- Informações do GERENTE --");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.printf("Salario: R$%.2f\n", this.getSalario());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Setor de gerência: " + setorGerencia);
        System.out.printf("INSS: R$%.2f\n", inss());
    }

}
