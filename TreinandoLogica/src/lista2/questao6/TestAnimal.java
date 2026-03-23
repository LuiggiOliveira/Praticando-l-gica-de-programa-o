package lista2.questao6;

public class TestAnimal {
    public static void main(String[] args){
        Cachorro dog1 = new Cachorro("Juninho", 14, "Caramelo", "Masculino");
        Cachorro dog2 = new Cachorro("Mariana", 13, "Golden Retriever", "Feminino");

        Peixe fish1 = new Peixe("Julinha", 0.1, "Ornamental");
        Peixe fish2 = new Peixe("Marcelo", 35, "Água Doce");
        Peixe fish3 = new Peixe("Rodrigo", 200, "Marinho");

        dog1.exibirDados();
        dog2.exibirDados();

        fish1.exibirDados();
        fish2.exibirDados();
        fish3.exibirDados();
    }
}
