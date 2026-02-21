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

        // Calculando a moda (aceita multimodal)
        public static double calcularModa(double[] array){

            int qtdModas = 1;
            double[] modas = new double[qtdModas]; //sem ArrayList é triste...

            // PRIMEIRO PASSO: descobrir a maior frequência
            int maiorFreq = 0;
            int freqAtual = 1;


            return 1; //CONTINUAR DEPOIS, FÉRIAS ACABANDO E EU TENHO OUTRAS COISAS PARA ESTUDAR :(
        }
    }

    public static void main(String[] args) {

        //obs: é interessante notar que eu não precisei fazer por exemplo: double[] array = new double[]{1,2,3,4,5}
        double resultado1 = Estatistica.calcularMedia(new double[]{8.8,8,9.3,8.5,8.7,8.7,8.3,8.2}); //aqui eu já coloco direto na função
        double resultado2 = Estatistica.calcularMediana( new double[]{8.8,8,9.3,8.5,8.7,8.7,8.3,8.2});

        System.out.printf("Média: %.2f\n", resultado1);
        System.out.printf("Mediana: %.2f\n", resultado2);

    }
}
