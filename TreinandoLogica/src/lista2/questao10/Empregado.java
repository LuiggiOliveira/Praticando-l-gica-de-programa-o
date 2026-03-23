package lista2.questao10;

public abstract class Empregado extends Pessoa {
    private double salario;
    private final int matricula;

    public Empregado(String nome, int idade, char sexo, double salario, int matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public abstract void exibirEmpregadoInfo();

    public double inss(){
        return this.salario*0.11;
    }

    public double getSalario(){
        return this.salario;
    }

    public int getMatricula(){
        return this.matricula;
    }
}
