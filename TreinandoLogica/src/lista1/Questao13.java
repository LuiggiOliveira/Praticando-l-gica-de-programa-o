/*
Observe a seguinte propriedade que alguns números maiores que 1000 e menores que 9999 possuem:
Número: abcd
        (ab) + (cd) = (ef)
        (ef)² = abcd
Exemplo: 3025
         30 + 25 = 55
         55² = 3025
Resultado esperado: 2025 3025 9801

Faça um programa que imprima todos os números que satisfaçam esta propriedade.
 */

package lista1;

public class Questao13 {

    //preciso dividir pela metade o número, já que está entre 1000 e 9999, ou seja,
    //sempre é um número de 4 dígitos

    //separo em duas variáveis e depois somo elas em um resultado

    //pego esse resultado e elevo ao quadro, depois verifico se é igual ao valor de entrada

    public static void verificar(){
        int a, b, soma;
        for (int i = 1000; i <= 9999; i++) {
            a = i%100; //3025%100 = 25
            b = i/100; //3025/100 = 30
            soma = a+b;
            soma = (int) Math.pow(soma, 2);

            if (soma == i) {
                System.out.println(soma);
            }
        }


    }

    public static void main(String[] args) {
        verificar();
    }
}
