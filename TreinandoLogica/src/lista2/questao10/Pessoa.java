package lista2.questao10;

public abstract class Pessoa {
    private final String nome;
    private int idade;
    private final char sexo; //'M' ou 'F'

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }
}
