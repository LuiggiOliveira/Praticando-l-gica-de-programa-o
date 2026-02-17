/* Escreva um aplicativo que aceita como entrada um inteiro positivo e determine se este é um número perfeito.
Um número inteiro é perfeito se é igual à soma de seus divisores próprios. Divisores próprios de um número positivo N
são todos os divisores inteiros positivos de N exceto o próprio N. Por exemplo, o número 6, tem divisores próprios
1, 2 e 3, cuja soma é igual à 6, ou seja, 1 + 2 + 3 = 6. Logo 6 é um número perfeito. */

package lista1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor inteiro positivo maior que zero para verificar se ele é um número perfeito: ");
        int testNumber = input.nextInt();
        int sum = 0;

        if (testNumber <= 0) {
            System.out.println("ERRO! O número digitado deve ser maior que 0.");
        }
        else {
            for (int i = 1; i < testNumber; i++) {
                if (testNumber % i == 0) { //todo divisor devolve resto 0
                    sum += i;
                }
            }

            if (sum == testNumber) {
                System.out.printf("Sim! %d é um número perfeito.", testNumber);
            } else {
                System.out.printf("Não... %d não é um número perfeito.", testNumber);
            }
        }
    }
}
