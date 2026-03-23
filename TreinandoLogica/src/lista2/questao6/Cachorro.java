package lista2.questao6;

import java.sql.SQLOutput;

public class Cachorro extends Animal {
    private String sexo;
    private String raca;

    public Cachorro(String nome, double peso, String raca, String sexo) {
        super(nome, peso);
        this.raca = raca;
        this.sexo = sexo;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nExibindo dados do animal...");
        System.out.println("-> Tipo: Cachorro");
        System.out.println("-> Nome: " + this.getNome());
        System.out.println("-> Peso(kg): " + this.getPeso());
        System.out.println("-> Sexo: " + this.sexo);
        System.out.println("-> Raça: " + this.raca);
    }

    //Getters e Setters
    public  String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
