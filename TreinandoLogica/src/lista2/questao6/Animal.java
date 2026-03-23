/*
Crie uma classe Animal que deve possuir os dados nome e peso. Crie uma subclasse chamada Peixe que deve possuir o tipo
de habitat (marinho, água doce, ornamental). Cria outra subclasse Cachorro que deve possuir a raça e o sexo do cachorro.
Faça a classe de teste e execute o programa.
 */

package lista2.questao6;

public abstract class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public abstract void exibirDados();

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public double getPeso(){
        return peso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
}
