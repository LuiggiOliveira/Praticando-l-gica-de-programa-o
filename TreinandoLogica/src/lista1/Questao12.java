/**
 * Classe responsável por calcular as somas das séries S1, S2 e S3.
 * <p>
 * Faça um programa para calcular o valor das seguintes expressões:
 * <br>
 * <img src="doc-files/exercicio_formulas.png" alt="Fórmulas das Séries S1, S2 e S3">
 * </p>
 * * @author Luiggi
 */

//Só testando o javadoc... Ignora. Mas basicamente é para eu calcular as expressões S1, S2, S3 e ver se bate com o resultado...
//S1 = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 -> resultado: 95,5007946616706
//S2 = 2¹/50 + 2²/49 + 2³/48 + ... + 2^50/1 -> resultado: 1,5608286920413398E15
//S3 = 1/1 - 2/4 + 3/9 - 4/16 + 5/25 - ... - 10/100 -> resultado: 0,6456349206349207

package lista1;

//Essa foi fácil, mas gostei
public class Questao12 {
    public static void main(String[] args) {
        //S1 = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 -> resultado: 95,5007946616706
        double numerador = 1, denominador = 1, resultado = 0; //eu estava colocando como 'int' e isso estava resultando em 50
        while (denominador <= 50) {
            resultado +=  numerador / denominador;
            numerador += 2;
            denominador++;
        }
        System.out.println("Resultado de S1: " + resultado);

        //S2 = 2¹/50 + 2²/49 + 2³/48 + ... + 2^50/1 -> resultado: 1,5608286920413398E15
        numerador = 2;
        denominador = 50;
        resultado = 0;
        while (denominador >= 1) {
            resultado +=  numerador / denominador;
            numerador *= 2;
            denominador--;
        }
        System.out.println("Resultado de S2: " + resultado);

        //S3 = 1/1 - 2/4 + 3/9 - 4/16 + 5/25 - ... - 10/100 -> resultado: 0,6456349206349207
        //num. impar par impar   par    impar        par, ou seja, de impar -> par é -, de par -> impar é +
        numerador = 1;
        denominador = 1;
        resultado = 0;
        int contador = 1;

        while (denominador <= 100) {
            //sempre que o contador for par, subtraio de resultado
            if (contador % 2 == 0) {
                resultado -=  numerador / denominador;
            }

            //caso contrário, quando é par, soma normalmente
            else {
                resultado += numerador / denominador;
            }

            numerador++;
            denominador = Math.pow(numerador, 2); //já que o denominador é o quadrado do numerador
            contador++;
        }
        System.out.println("Resultado de S3: " + resultado);
    }
}
