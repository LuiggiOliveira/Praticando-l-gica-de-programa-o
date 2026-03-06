/*
Verifique se as componentes de um vetor de 10 componentes inteiros lidos pelo teclado formam uma progressão aritmética,
informando se sim ou se não. Caso forme, imprima o termo inicial e a razão.

EXTRA: somatório dos elementos
 */

package lista1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//exemplo: P.A. (razão = 3) {1, 4, 7, 10, 13, 16, ..., an) -> sempre deve ser true: sucessor - anterior = razao
public class Questao16 {

    public static int somatorio(int a0, int an, int qtdElementos){
        return (a0+an)*qtdElementos/2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] pa =  new int[10];

        System.out.println("Preencha o vetor de " + pa.length + " posições:");
        for (int i = 0; i < pa.length; i++){
            pa[i] = input.nextInt();
        }

        System.out.println("Verificando se é uma PA...");
        int razao = pa[1] - pa[0];
        boolean verificando = false;
        for (int i = 0; i < pa.length-1; i++){
            if (pa[i+1] - pa[i] == razao){
                razao = pa[i+1] - pa[i];
                verificando = true;
            }
            else{
                System.out.println("Não é uma PA! A razão deve ser constante.");
                verificando = false;
                break;
            }
        }

        if (verificando){
            System.out.println("É uma PA!");
            System.out.println("Razão: " + razao);
            System.out.println("Termo Inicial: " + pa[0] + " | Termo Final: " + pa[pa.length-1]);
            System.out.println("Somatório de todos elementos: " + somatorio(pa[0],pa[pa.length-1],pa.length));
        }
    }
}
