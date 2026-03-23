/*
Crie uma classe Calculadora que deve implementar as funções básicas (somar, subtrair, multiplicar e dividir).
Utilizando o conceito de herança, crie uma classe CalculadoraCientifica que implementa os seguintes cálculos:
raiz quadrada e potência. Utilize a classe Math do pacote Java.Lang.
*/

package lista2.questao5;

public class Calculadora {
    public static double somar(double a, double b) { return a + b; }
    public static double subtrair(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            System.out.println("-> ERRO!!! É impossível dividir por zero. Tente novamente.");
            return 0;
        }
        return numerador / denominador;
    }
}
