/*
Escreva uma classe em java que receba um vetor com 10 valores inteiros e ordene os mesmo em ordem crescente.
(fiquei muito tempo tentando várias ideias para evitar usar o bubbleSort, mas sinto que vou ter que me render a ele se eu quiser
continuar fazendo essa lista até ir para a segunda logo)
*/

package lista1;

public class Questao9 {

    // diferentemente no bubblesort que mexe toda hora nos dados, trocando loucamente, esse só troca quando necessário, custando menos na memória
    public static int[] orderByASC(int[] vetor) {

        int ultimo; // Bingo: era exatamente disso que eu precisava, uma forma de dizer até onde a busca deve ir, uma "parede móvel"

        for (ultimo = vetor.length - 1; ultimo > 0; ultimo--) {
            //vetor = {2, 1, 9, 6, 7}
            int indiceMaior = 0;
            int maiorAtual = vetor[0];

            //Vai procurar o maior valor até onde a parede está delimitando no vetor
            for (int i = 1; i <= ultimo; i++) {
                if (vetor[i] > maiorAtual) {
                    indiceMaior = i;
                    maiorAtual = vetor[i];
                }
            }

            int temp = vetor[ultimo]; //9, ultimo = 4 |7, ultimo = 3 |6, ultimo = 2|2, ultimo = 1|1, ultimo = 0 | STOP
            vetor[ultimo] = maiorAtual;
            vetor[indiceMaior] = temp;
        }

        return vetor;
    }

    public static int[] orderByDESC(int[] vetor) {

        int ultimo;

        for (ultimo = vetor.length - 1; ultimo > 0; ultimo--) {
            //vetor = {2, 1, 9, 6, 7}
            int indiceMenor = 0;
            int menorAtual = vetor[0];

            //Vai procurar o menor valor até onde a parede está delimitando no vetor
            for (int i = 1; i <= ultimo; i++) {
                if (vetor[i] < menorAtual) {
                    indiceMenor = i;
                    menorAtual = vetor[i];
                }
            }

            int temp = vetor[ultimo]; //1, ultimo = 4 |2, ultimo = 3 |6, ultimo = 2|7, ultimo = 1|9, ultimo = 0 | STOP
            vetor[ultimo] = menorAtual;
            vetor[indiceMenor] = temp;
        }
        return vetor; //{9, 7, 6, 2, 1}
    }

    public static void main(String[] args) {
        int[] vetor = {2, 1, 9, 7, 6, 5, 0, 4, 3, 0, 9, 5};

        System.out.println("Vetor inicial");
        for (int j : vetor) {
            System.out.print(j + " ");
        }

        System.out.println("\nVetor em ordem crescente");
        for (int i : orderByASC(vetor)) {
            System.out.print(i + " ");
        }

        System.out.println("\nVetor em ordem decrescente");
        for (int i : orderByDESC(vetor)) {
            System.out.print(i + " ");
        }
        //FINALMENTE, essa deu mais trabalho que a anterior...
    }

}
