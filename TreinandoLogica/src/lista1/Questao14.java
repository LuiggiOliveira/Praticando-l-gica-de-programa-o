/*
Faça um programa para calcular o Máximo Divisor Comum entre 2 números passados como argumentos para a execução
do programa. Observe as seguintes propriedades do MDC:

MDC(x,y) = MDC(x-y,y), se x > y;    DICA: Para converter uma string "10"
MDC(x,y) = MDC(y,x);                      para o número 10 use:
MDC(x,x) = x.                             Integer.parseInt("10");

Exemplo: MDC(3,5)=MDC(5,3)=MDC(2,3)=MDC(3,2)=MDC(1,2)=MDC(2,1)=MDC(1,1)=1
64,36 -> 28, 36 -> 36, 28 -> 8, 28 -> 28, 8 -> 20, 8 -> 12, 8 -> 4, 8 -> 8,4-> 4, 4 -> 4
*/

package lista1;

//Interessante, não conhecia essa maneira de calcular MDC a não ser pelo tradicional... Anotado.
public class Questao14 {

    public static int mdc(int x, int y){

        while (true){
            if (x > y){
                x = x - y;
            }

            if (x == y){
                return x;
            }

            int temp = x;
                x = y;
                y = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(mdc(132,18));
    }
}
