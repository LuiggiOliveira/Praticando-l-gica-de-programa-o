/*
Considere um vetor de 10 números inteiros positivos maiores que zero e um único número X inteiro, também positivo e
maior que zero. Faça um programa para:
a) ler pelo teclado o vetor;
b) ler pelo teclado o número X;
c) encontrar e imprimir o par de posições consecutivas cujas componentes possuam a maior distância entre elas;
ex: {1, 5, 7, 10} -> {1,5},{5,7}.{7,10} -> |1-5|=4 -> |5-7| = 2 -> |7-10| = 3 -> maior distância é 4
d) verificar se o vetor está em ordem crescente, decrescente ou não ordenado;
e) dizer quantos números no vetor são maiores que X, menores que X e iguais a X. todo SÓ FALTA ESSE AQUI
 */

package lista1;

import java.util.Scanner;

public class Questao15 {

    public static void exibirVetor(int[] vetor){
        System.out.println("Exibindo vetor...");
        for (int i : vetor){
            System.out.print(i + " ");
        }
        System.out.println(); //agora que percebi que não precisava de argumentos aqui... acostumei com printf("\n") de C
    }

    public static void exibirMaiorDist(int[] vetor){
        int[] pares_maiorDist = new int[3]; //ex: {1, 5, 7, 10} -> maiorDist = 4 -> pares_maiorDist = {i, j, maiorDist} = {1,5,4}

        for (int i = 0, j = i+1; j < vetor.length; i++, j++){ //o 'j' é o primeiro a 'vazar' se eu não colocar essa condição de parada
            int modulo = Math.abs(vetor[i] - vetor[j]);
            if (modulo > pares_maiorDist[2]){ //se fosse '≥' e, por exemplo, {5 8 5}, iria parar em {8,5}, mas eu quis pegar sempre o primeiro
                pares_maiorDist[0] = vetor[i];
                pares_maiorDist[1] = vetor[j];
                pares_maiorDist[2] = modulo;
            }
        }
        System.out.printf("Pares consecutivos de maior distância = {%d,%d} -> Distância = %d\n", pares_maiorDist[0], pares_maiorDist[1], pares_maiorDist[2]);
    }

    public static void exibirMensagem(int[] vetor){
        //a ideia é ver "quem fica com mais pontos vence", como se cada opção de mensagem fosse um "player"
        int[] pontos = new int[2]; //i=0 -> crescente | i=1 -> decrescente
        boolean teste = false;  //eu poderia começar a usar outros tipos de dados... Tipo short, long...

        //Varrendo o vetor até achar algum elemento diferente
        for (int i = 0; i < vetor.length-1; i++){
            if (vetor[i] != vetor[i+1]){
                teste = true;
                break;
            }
        }

        //True quando há ao menos 1 elemento diferente e False apenas se todos os elementos forem iguais
        if (teste) {
            //Pontuando se o antecessor é maior ou menor que o sucessor
            for (int i = 0; i < vetor.length-1; i++) {
                if (vetor[i] <= vetor[i + 1]) {
                    pontos[0]++;
                } else if (vetor[i] >= vetor[i + 1]) {
                    pontos[1]++;
                }
            }

            //Só vai ser CRESCENTE ou DECRESCENTE se um deles obtiverem pontuação máxima (baseado em vetor.length-1),
            //porém, se um dos dois não chegarem na pontuação máxima, então é DESORDENADO
            int ganhador = 2;
            for (int j = 0; j < pontos.length; j++){
                if (pontos[0] == vetor.length-1) {
                    ganhador = 0;
                } else if (pontos[1] == vetor.length-1){
                    ganhador = 1;
                }
                //caso nenhuma condição seja atendida então é DESORDENADO
            }

            switch (ganhador) {
                case 0:
                    System.out.println("O vetor está em ordem CRESCENTE");
                    break;
                case 1:
                    System.out.println("O vetor está em ordem DECRESCENTE");
                    break;
                case 2:
                    System.out.println("O vetor está DESORDENADO");
            }
        }

        else{
            System.out.println("Todos os elementos desse vetor contém o mesmo valor.");
        }
    }

    public static void exibirMensagem2(int x, int[] vetor){
        int[] contar = new int[3]; //{maiores,menores,iguais}

        //vai simplesmente contar cada ocorrência e armazenar
        for (int i : vetor) {
            if (i > x) {
                contar[0]++;
            }

            if (i < x) {
                contar[1]++;
            }

            if (i == x) {
                contar[2]++;
            }
        }

        System.out.printf("Qtd de -> Maiores que X: %d |Menores que X: %d |Iguais a X: %d\n", contar[0], contar[1], contar[2]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor x: ");
        int x = scanner.nextInt();
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho =  scanner.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Agora preencha o vetor: ");
        for (int i = 0; i < tamanho; i++ ) {
            vetor[i] = scanner.nextInt();
        }

        exibirVetor(vetor);
        exibirMaiorDist(vetor);
        exibirMensagem(vetor);
        exibirMensagem2(x, vetor);
    }
}
