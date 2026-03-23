package lista2.questao5;

import static java.lang.Math.sqrt;

public class CalculadoraCientifica extends Calculadora{
    public static double potencia(int base, double expoente){
        double resultado = base;
        for (int i = 0; i < expoente -1; i++){
            resultado *= base;
        }
        return resultado;
    }

    public static double raizQuadrada(int radicando){
        if (radicando >= 0){
            return sqrt(radicando);
        }

        System.out.println("-> ERRO!!! Não coloque número negativo na raíz (número do Conjunto dos Complexos), somente positivos e inteiros");

        return 0;
    }
}
