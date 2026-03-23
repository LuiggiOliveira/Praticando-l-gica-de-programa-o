package lista2.questao6;

public class Peixe extends Animal {
    private String habitat;

    public Peixe(String nome, double peso,  String habitat) {
        super(nome, peso);
        this.habitat = habitat;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nExibindo dados do animal...");
        System.out.println("-> Tipo: Peixe");
        System.out.println("-> Nome: " + this.getNome());
        System.out.println("-> Peso(kg): " + this.getPeso());
        System.out.println("-> Habitat: " + this.habitat);
    }

    //Getters e Setters
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
