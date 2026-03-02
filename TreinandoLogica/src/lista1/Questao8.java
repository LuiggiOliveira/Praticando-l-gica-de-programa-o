/*
Escreva uma classe Estatística em Java que contenha métodos estáticos que recebam um array de inteiros,
juntamente com o número de elementos, e calculem respectivamente:
a) a moda dos elementos no array (elemento mais freqüente).
b) a mediana dos elementos no array(elemento central).
c) a média.
*/

package lista1;

import java.util.Arrays; //para ordenar usando array.sort()

public class Questao8 {
    public static class Estatistica{
        // Calculando a média
        public static double calcularMedia(double[] array){
            double media = 0;
            for (double i : array) { //eu iria usar a estrutura clássica do for, mas achei mais interessante com for-each
                media += i; //vai modificar apenas o valor da variável e não do array
            }
            return media/array.length;
        }

        // Calculando a mediana
        public static double calcularMediana(double[] array){
            double mediana = 0;

            //ordenando em rol
            Arrays.sort(array); //8\8.2\8.3\8.5\8.7\8.7\8.8\9.3 mediana -> (8.5 + 8.7)/2 = 8,6
            if (array.length % 2 == 0){
                //se calcularMedia recebesse apenas dois valores, daria para usar aqui...
                //[1, 2, 3, 4]->(a[4/2]+a[(4/2)-1])/2->(a([2]+a[1])/2)->(3+2)/2 = 2.5
                mediana =  (array[array.length/2] + array[(array.length/2) - 1]) / 2;
            }
            else{ //caso seja ímpar a qtd de elementos do array (chamando array, mas é vetor na realidade, já que array é matriz)
                mediana = array[array.length/2]; //[1,2,3,4,5] -> a[5/2] -> a[2] -> 3
            }
            return mediana;
        }

        // Calculando a moda -> ADICIONAR O CASO EM QUE NÃO TEM MODA
        public static void calcularModa(double[] array){

            int[] frequency = new int[array.length]; //ex: array = {2, 3, 3, 4} -> freq = {1, 2, 2, 1}
            double[] moda = new double[array.length];
            int maiorFreq = 0;
            int qtdFreqMax = 0; //representa o número de vezes em que a frequência máxima foi atingida

            // PREENCHENDO O VETOR frequency
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    //conforme itera, enquanto haver elementos repetidos, para cada elemento de mesmo valor, vai sendo
                    //incrementado até que seja o último elemento repetido daquele valor, resultando na frequência absoluta
                    if (array[i] == array[j]) {
                        //vai preenchendo em "escadinha", ou seja, para cada valor repetido, o primeiro começa com o total
                        //de vezes que se repete e depois vai diminuindo nas próximas vezes até 1
                        frequency[i]++; //{1, 1, 1, 2, 2, 3} -> freq = {3, 2, 1, 2, 1, 1}
                    }
                }
            }

            // DESCOBRINDO A MAIOR FREQUÊNCIA ABSOLUTA
            for (int i = 0; i < array.length; i++) {
                if (frequency[i] > maiorFreq) {
                    maiorFreq = frequency[i]; //define qual é a maior frequência absoluta
                }
            }

            // RESOLVENDO O CASO EM QUE É AMODAL COM *** MATEMÁTICA ***
            for (int i = 0; i < array.length; i++) {
                if (frequency[i] == maiorFreq) {
                    qtdFreqMax++;
                }
            }

            //tendo que freqMax * qtdFreqMax = array.length
            //ou seja, se eu tenho {1, 2, 3} -> freqMax = 1 | qtdFreqMax = 3 | array.length = 3
            //e mudo para {1, 2, 3, 1, 2, 3} -> freqMax = 2 | qtdFreqMax = 3 | array.length = 6
            //isso significa que quanto mais eu aumento a freqMax (x), para que se mantenha amodal é necessário que array.length (f(x))
            //aumente proporcionalmente, assim como em uma função linear: f(x) = x * freqMax (freqMax é uma constante)
            // * fim da palestrinha *

            if(qtdFreqMax * maiorFreq == array.length && maiorFreq != array.length && array.length > 1) {
                System.out.println("Amodal");
            }

            else {
                // PREENCHENDO VETOR moda E IMPRIMINDO SEUS ELEMENTOS (sem repetição)
                System.out.print("Moda: ");
                for (int i = 0; i < frequency.length; i++) {
                    if (frequency[i] == maiorFreq) {
                        moda[i] = array[i];
                        System.out.printf("%.2f ", moda[i]);
                    }
                }
            }

            System.out.println("\nFrequência absoluta máxima: " + maiorFreq);
        }
    }

    public static void main(String[] args) {

        //obs: é interessante notar que eu não precisei fazer por exemplo: double[] array = new double[]{1,2,3,4,5}
        double resultado1 = Estatistica.calcularMedia(new double[]{8.8,8,9.3,8.5,8.7,8.7,8.3,8.2}); //aqui eu já coloco direto na função
        double resultado2 = Estatistica.calcularMediana( new double[]{8.8,8,9.3,8.5,8.7,8.7,8.3,8.2});
        System.out.printf("Média: %.2f\n", resultado1);
        System.out.printf("Mediana: %.2f\n", resultado2);

        System.out.println("\nTeste 1 quando existe moda: ");
        Estatistica.calcularModa(new double[]{8, 8, 8, 2, 2, 3});

        System.out.println("\nTeste 2 quando não existe moda: ");
        Estatistica.calcularModa(new double[]{100, 99, 98, 97});

        System.out.println("\nTeste 3 quando existe moda, pois só há um valor e que se repete N vezes (ou só uma)");
        Estatistica.calcularModa(new double[]{100, 100});
        Estatistica.calcularModa(new double[]{100});
    }
}
