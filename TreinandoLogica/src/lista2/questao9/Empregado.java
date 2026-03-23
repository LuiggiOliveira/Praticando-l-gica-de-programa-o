/*
Crie uma classe Empregado que inclui variáveis de instância: nome, sobrenome, salário mensal. A classe deve possuir um
construtor e métodos que permitam modificar os valores das variáveis de instância. Crie também uma variável para contar
a quantidade de empregados cadastrados. Crie uma classe EmpregadoTeste que cria dois objetos Empregado e exibe as
informações de cada objeto e também a quantidade de empregados cadastrados.
 */

package lista2.questao9;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    private static int qtdCadastros;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        qtdCadastros++;
    }

    public void exibirInfo(){
        System.out.println("\n-- Exibindo informações do Empregado...");
        System.out.println("* Nome: " + this.nome);
        System.out.println("* Sobrenome: " + this.sobrenome);
        System.out.printf("* Salário: R$%.2f\n",this.salario);
    }

    //Getters e Setters
    public static int getQtdCadastros() { return  qtdCadastros; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
