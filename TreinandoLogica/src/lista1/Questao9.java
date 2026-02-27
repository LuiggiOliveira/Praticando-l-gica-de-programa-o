package lista1;

public class Questao9 {

    //toda vez que eu chamar ela, ela me retorna o maior do vetor inserido
    public static int maior(int[] vetor){
        int maior = 0;

        for (int i : vetor) {
            if (i > maior) {
                maior = i;
            }
        }

        return maior;
    }

    //toda vez que eu colocar o próximo maior elemento, recorta esse pedaço e retorna outro vetor
    public static int[] recortar(int[] vetor){

        //vetor = {5, 2, 1, 3} -> return vetor_recortado = {2, 1, 3} (remove o maior)
        //o vetor vai sendo recortado várias vezes a cada chamada, depois ele retorna para a função principal até sobrar um elemento
        int[] vetor_recortado = new int[vetor.length-1];
        int maior = maior(vetor); //nesse caso é 5, então maior = 5

        for (int i : vetor){
            if(i )
        }


        return vetor_recortado;
    }

    public static void orderByASC(int[] vetor){

        int[] aux = new int[vetor.length]; //vetor que vai retornar pro usuário de fato


    }

    public static void main(String[] args) {
        int[] vetor = {5, 4, 1, 6, 9, 2, 3, 7, 8, 5};

        System.out.println("Vetor inicial");
        for (int i = 1; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor final");
        System.out.println(1.0/7.0);
    }

}
