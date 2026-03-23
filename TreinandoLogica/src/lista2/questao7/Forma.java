/*
Implemente uma classe chamada Forma onde serão declarados dois métodos: float CalculArea() e CalcularPerímetro().
Crie uma subclasse de forma com nome Retângulo, que deve possuir lado e altura. Crie outra subclasse chamada Círculo
que deve possuir o raio. Crie uma subclasse de Retangulo chamada Quadrado cujas instâncias são caracterizadas por
possuir lado e altura com mesmo valor. Elabore um programa teste que crie objetos dos tipos descritos acima,
receba seus valores e imprima respectivamente a área e perímetro correspondente de cada objeto.
 */

package lista2.questao7;

public abstract class Forma {
    public abstract double calcArea();
    public abstract double calcPerimetro();
}
