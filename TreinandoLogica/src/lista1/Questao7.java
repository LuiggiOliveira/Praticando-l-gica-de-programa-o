/*
Um número a é dito permutação de um número b se os dígitos de a formam uma permutação dos dígitos de b. Faça um
programa que lê dois inteiros positivos a e b e responda se a é permutação de b. Obs.: Considere que o dígito 0 (zero)
não aparece nos números. Exemplo: 5412434 é uma permutação de 4321445, mas não é uma permutação de 4312455.
*/

package lista1;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int resto;
        int[] digitos_a = {0,0,0,0,0,0,0,0,0,0}; //para cada posição i, representa a posição do dígito correspondente
        int[] digitos_b = {0,0,0,0,0,0,0,0,0,0};

        System.out.println("Digite um número: ");
        int a = input.nextInt();
        System.out.println("Digite outro numero: ");
        int b = input.nextInt();

        for (int i = 0; i < 10; i++){ //obs: .length() é só para objetos da classe String e .length é para os outros arrays

            //poderia fazer um for para cada número, mas... Continuando:
            resto = a%10; //4
            a /= 10; //541243
            digitos_a[resto]++; //incrementa na respectiva posição do dígito, ou seja, onde i = 4

            resto = b%10; //5
            b /= 10; //432144
            digitos_b[resto]++;//armazena onde a posição i = 5
        }

        boolean teste = true;
        System.out.println("E o resultado é...");
        for (int i = 0; i < 10; i++){ //lembrando que o zero é para ignorar realmente
            if (digitos_a[i] != digitos_b[i]){
                teste = false;
                System.out.println("A não é permutação de B.");
                break;
            }
        }

        if (teste){
            System.out.println("A é permutação de B.");
        }

        input.close();
    }
}
