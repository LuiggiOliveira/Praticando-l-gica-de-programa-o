/*
Aquecimento - Ler três valores: A, B e C e dizer se estes valores podem ser os lados de um triângulo.
Dica: a + b > c e a + c > b e b + c > a. Caso os valores formem um triângulo,
informar se o triângulo é equilátero (os três lados iguais), isósceles (2 lados iguais)
ou escalenos (três lados diferentes).
 */

package lista1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado A: ");
        int a = sc.nextInt();

        System.out.println("Digite o tamanho do lado B: ");
        int b = sc.nextInt();

        System.out.println("Digite o tamanho do lado C: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a){

            if (a == b && b == c){ System.out.println("Forma um triângulo equilátero!"); }

            if  (a != b && b != c){ System.out.println("Forma um triângulo escaleno!"); }

            else{ System.out.println("Forma um triângulo isósceles!"); }
            sc.close();
        }

        else{ System.out.println("Não forma um triângulo."); sc.close();}
    }
}
