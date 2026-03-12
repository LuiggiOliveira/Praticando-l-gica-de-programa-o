/*
Faça um programa que leia duas matrizes de reais A e B, com respectivos
tamanhos 5 x 4 e 4 x 6, e imprima a matriz
resultante A x B (multiplicação das matrizes), de tamanho 5 x 6.
 */

package lista1;

import java.util.Scanner;

public class Questao17 {

    static Scanner ler = new Scanner(System.in);

    public static void preencherMatriz(int[][] matriz){
        System.out.println("[!] Digite um valor para cada posição 'linha x coluna' da matriz:");
        for (int i = 0; i < matriz.length; i++ ) { //matrizA.length retorna num de linhas
            for (int j = 0; j < matriz[i].length; j++ ) {//matrizA[i].length retorna tamanho de cada coluna
                System.out.printf("%d x %d: ", i+1, j+1);
                matriz[i][j] = ler.nextInt();
            }
        }
    }

    public static void exibirMatriz(int[][] matriz){
        for (int linha = 0; linha < matriz.length; linha++) {
            for(int coluna = 0; coluna < matriz[0].length; coluna++) { //o tamanho da coluna é fixa
                System.out.print(matriz[linha][coluna] + " \t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] multiplicarMatriz(int[][] matrizA, int[][] matrizB){

        int[][] matrizC = new int[matrizA.length][matrizB[0].length];

        for(int  i = 0; i < matrizA.length; i++){ //repete 5 vezes e depois incrementa
            for(int j = 0; j < matrizB[0].length; j++){
                for(int k = 0; k < matrizA[0].length; k++){
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        //TODO BOTAR NET NO PC PRA FUNCIONAR O COMMIT
        return matrizC;
    }

    public static void main(String[] args) {
        int[][] matrizA = new int [5][4];
        int[][] matrizB = new int [4][6];
        int[][] matrizC;

        System.out.println("[*] Multiplicando matrizes");
        System.out.println("[*] Se a Matriz A possui tamanho 5x4 e a Matriz B possui tamanho 4x6, então a Matriz C (resultado) é 6x6.\n");

        preencherMatriz(matrizA);
        preencherMatriz(matrizB);
        System.out.println();

        matrizC = multiplicarMatriz(matrizA, matrizB);

        exibirMatriz(matrizA);
        exibirMatriz(matrizB);
        exibirMatriz(matrizC);

        ler.close();

        /*
        -- Exemplo de execução:
        int[][] matrizA = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}};
        int[][] matrizB = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24}};

        -- resultado esperado:
        matrizC = {
            {130 140 150 160 170 180},
            290 316 342 368 394 420},
            450 492 534 576 618 660},
            610 668 726 784 842 900},
            770 844 918 992 1066 1140}
        }
        */
    }

}
