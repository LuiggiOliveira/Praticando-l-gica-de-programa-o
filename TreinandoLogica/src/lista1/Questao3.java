/* Escreva um aplicativo que aceita como entrada um inteiro contendo somente 0s e 1s (isto é, um inteiro binário) e
imprime seu equivalente decimal. Caso o usuário digite um número com dígitos diferentes de 0s e 1s, uma mensagem de
erro deve ser exibida. */
package lista1;

import java.util.Scanner;

public class Questao3 {

    static int power(int base, int expoente){
        int soma = 1;
        if (expoente == 0){
            return soma;
        }

        for (int i = 0; i < expoente; i++){
            soma *= base;
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número binário: ");
        int binario = input.nextInt();
        int binarioAnterior = binario;

        int resto, decimal = 0, expoente = 0;

        while (binario != 0){
            resto = binario % 10;
            binario /= 10;

            if (resto == 1){
                decimal += Questao3.power(2, expoente);
            }

            expoente++;
        }

        System.out.printf("O binário %d foi convertido para o decimal %d", binarioAnterior, decimal);
    }
}
