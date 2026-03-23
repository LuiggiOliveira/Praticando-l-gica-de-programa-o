package lista2.questao2;

public class TestLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1995);
        Livro livro2 = new Livro(2008);
        Livro livro3 = new Livro(2017);

        //Preenchendo os dados
        livro1.setTitulo("Java: Como Programar");
        livro1.setAutor("Paul & Harvey Deitel");

        livro2.setTitulo("Clean Code: Habilidades Práticas do Agile Software");
        livro2.setAutor("Robert C. Martin - 'Uncle Bob'");

        livro3.setTitulo("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos");
        livro3.setAutor("Aditya Bhargava");

        //Exibindo os dados
        System.out.println("1. Livro para aprender Java");
        System.out.println("-- Título: " + livro1.getTitulo());
        System.out.println("-- Autor: " + livro1.getAutor());
        System.out.println("-- Ano de Publicação: " + livro1.getAnoPublicacao());

        System.out.println("2. Livro para aprender e aplicar boas práticas de clean code");
        System.out.println("-- Título: " + livro2.getTitulo());
        System.out.println("-- Autor: " + livro2.getAutor());
        System.out.println("-- Ano de Publicação: " + livro2.getAnoPublicacao());

        System.out.println("1. Livro para aprender algoritmos e estrutura de dados");
        System.out.println("-- Título: " + livro3.getTitulo());
        System.out.println("-- Autor: " + livro3.getAutor());
        System.out.println("-- Ano de Publicação: " + livro3.getAnoPublicacao());
    }
}
