/*
 Escreva um aplicativo em Java que solicite ao usuário inserir o tamanho do lado de um quadrado e
 então exiba um quadrado vazio desse tamanho feito de asteriscos. Seu programa deve trabalhar com quadrados de
 todos os comprimentos de lado possíveis entre 1 e 20. Caso o usuário escolha um tamanho inválido,
 uma mensagem de erro deve ser exibida.
 */
package lista1;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho de 1 até 20 do quadrado");
        int tamanho = sc.nextInt();

        if (tamanho >= 1 && tamanho <= 20){

            for (int i = 0; i < tamanho; i++){
                for (int j = 0; j < tamanho; j++){
                    if (i > 0 && i < tamanho-1 && j > 0 && j < tamanho-1){
                        System.out.print("   ");
                    }
                    else {
                        System.out.print(" * ");
                    }
                }
                System.out.println("");
            }

        }
        else {
            System.out.println("Tamanho inválido. Digite um tamanho entre 1 e 20.");
        }

        sc.close();
    }
}
