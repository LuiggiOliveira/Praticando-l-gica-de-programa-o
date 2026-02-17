/*
Escreva um aplicativo de calculadora que receba um valor em ponto flutuante, um operador e a seguir mais um valor em
ponto flutuante. Utilize o comando switch para realizar a conta para as operações de soma, subtração, multiplicação e
divisão e exiba o resultado. Caso o operador seja inválido ou ocorra uma divisão por zero, uma mensagem de erro deve
ser mostrada.
*/

package lista1;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- SuperCalculator2000 ---");
        System.out.println("Siga as instruções digitando o...");
        System.out.print("1° valor: ");
        double x = input.nextDouble();

        System.out.print("Operação (+,-,*,/): ");
        char operator = input.next().charAt(0);

        System.out.print("2° valor: ");
        double y = input.nextDouble();

        double resultado = 0;

        switch(operator) { //no java 17 (do 14 para frente, na verdade) tem o '->' no lugar do ':' para melhorar o switch
            case '+':
                resultado = x + y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;

            case '/':
                if (y == 0) {
                    System.out.println("*** ERRO! Você está tentando dividir um número por zero ***");
                    break;
                }
                resultado = x / y;
                break;

            default:
                break;
        }

        System.out.println("Resultado: " + resultado);
        input.close();
    }
}
