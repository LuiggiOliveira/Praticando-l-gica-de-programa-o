package lista2.questao5;

public class TestCalculadora {
    public static void main(String[] args) {
        //somar()
        System.out.println("Resultado da soma = " + Calculadora.somar(200.5, 199.5));
        System.out.println("Testando 0.1 + 0.2 = " + Calculadora.somar(0.1, 0.2)); //clássico

        //subtrair()
        System.out.println("\nResultado da subtração = " + Calculadora.subtrair(200.5, 199.5));
        System.out.println("Testando 0.3 - 0.1 = " + Calculadora.subtrair(0.3, 0.1));

        //multiplicar()
        System.out.println("\nResultado da multiplicação = " + Calculadora.multiplicar(1.5, 1.5));
        System.out.println("Testando 0.1 * 2.2 = " + Calculadora.multiplicar(0.1, 2.2));

        //dividir()
        System.out.println("\nResultado da divisão = " + Calculadora.dividir(1000, 0.5));
        Calculadora.dividir(1000, 0);

        //potencia()
        System.out.println("\nResultado da potência = " + CalculadoraCientifica.potencia(2, 10));

        //raizQuadrada()
        System.out.println("\nResultado da raíz quadrada = " + CalculadoraCientifica.raizQuadrada(100));
        CalculadoraCientifica.raizQuadrada(-100);
    }
}
