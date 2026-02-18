/*
Escreva um método estático que receba uma cadeia de caracteres, representada por uma String, que armazena o caminho
do diretório raiz até um arquivo específico. Exemplo: C:\musicas\somewhereintime\themeofpaganini.mp3 O método deve
retornar uma nova String contendo apenas o nome do arquivo sem o caminho de diretórios.
*/

package lista1;

import java.util.Scanner;

public class Questao6 {

    public static String searchString(String root){
        int i;
        String resultado = "";

        for (i = root.length() - 1; i >= 0; i--) {
            if (root.charAt(i) == '\\') { // barra dupla, pois o java acha que é algum comando especial dentro de String
                break; //guarda a posição da primeira barra da direita para esquerda
            }
        }

        for (int j = i+1; j < root.length(); j++) { //começa a partir de onde parou e agora pega só a parte da direita
            resultado += root.charAt(j); //vai concatenar cada caractere numa variável a qual a função irá retornar
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cole o caminho do diretório raíz até o arquivo específico: ");
        String root = input.next(); //C:\musicas\somewhereintime\themeofpaganini.mp3
        System.out.println(searchString(root));
    }
}
