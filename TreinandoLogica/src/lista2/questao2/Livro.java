/*
Crie uma classe chamada Livro, que represente os dados de um livro básico. A classe deve conter:
• Um atributo privado titulo (String).
• Um atributo privado autor (String).
• Um atributo privado anoPublicacao (int).
• Métodos get para todos os atributos.
• Métodos set para título e autor.
• O anoPublicacao não pode ser alterado após a criação do objeto (usar construtor).

O programa deverá conter:
1. Criar três objetos Livro.
2. Definir título e autor usando setters.
3. Exibir os dados completos de cada livro.
 */

package lista2.questao2;

public class Livro {
    private String titulo;
    private String autor;
    private final int anoPublicacao;

    public Livro (int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
