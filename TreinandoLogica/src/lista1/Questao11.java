/*
Em álgebra linear, a diagonal secundária de uma matriz A é a coleção das entradas
Aij em que i + j é igual a n + 1 (onde n é a ordem da matriz). A diagonal secundária de uma matriz quadrada une o seu
canto superior direito ao canto inferior esquerdo.

Escreva um algoritmo Java que declara uma matriz 3x3 e pede ao usuário para informar seus valores.
Em seguida mostre todos os valores da matriz e a soma dos elementos da diagonal
secundária e da primária.
 */

package lista1;

import java.util.Scanner;

public class Questao11 { //Lembranças de matrizes em Python...

    public static void exibirMatriz(int[][] matriz){
        System.out.println("Exibindo a matriz:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public static int calcDiagPrinc(int[][] matriz){
        int diagPrinc = 0;

        for (int i=0;i<matriz.length;i++){
            diagPrinc+=matriz[i][i];
        }

        return diagPrinc;
    }

    public static int calcDiagSec(int[][] matriz){
        int diagSec = 0;

        for (int i=0;i<matriz.length;i++){
            diagSec+=matriz[i][matriz.length-1-i];
            //eu poderia fazer if (i+j == matriz.length-1) { diagSec+=matriz[i][j];} dentro de um outro for... Só que
            //dá pra simplificar e já ir acostumando pensar em outras maneiras de evitar o -> O(n²)
        }

        return diagSec;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz quadrada: ");
        int ordem = input.nextInt();
        int[][] matriz = new int[ordem][ordem]; //curiosidade aleatória: é possível criar Jagged Arrays (matrizes irregulares/dentadas) em java

        System.out.println("Preenchendo a matriz:");
        for (int linha = 0; linha < ordem; linha++) {
            for (int coluna = 0; coluna < ordem; coluna++) {
                System.out.printf("(i)%dx%d(j)\n", (linha+1), (coluna+1));
                int valor = input.nextInt();
                matriz[linha][coluna] = valor;
            }
        }
        exibirMatriz(matriz);
        System.out.println("Soma da Diagonal Principal = " + calcDiagPrinc(matriz));
        System.out.println("Soma da Diagonal Secundaria = " + calcDiagSec(matriz));

        input.close();
    }
}
