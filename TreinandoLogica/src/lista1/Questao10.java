//Escreva uma classe em java que verifique se um vetor de caracteres é um palíndromo. Ex: AXYXA

package lista1;

public class Questao10 {

    //eu poderia criar o método que faça isso diretamente na classe Pai, mas vou colocar ele dentro de uma classe Filha
    //e agora que descobri o "todo" e "fixme" do intellij

    public static class Palindromo{

        String valor;

        public Palindromo(String valor){
            this.valor = valor;
        }

        public static void EhPalindromo(String palindromo){ //fiquei tanto tempo na questão passada que já ia colocando "int[] vetor"
            int tamanho = palindromo.length();
            boolean teste = true; //obs: poderia até usar int teste = 1, mas acaba sendo mais legível e econômico em termos de memória assim

            // Graças ao bom Java, é possível fazer isso!
            for (int i = 0, j = tamanho-1; i < j; i++, j-- ){
                if (palindromo.charAt(i) != palindromo.charAt(j)){
                    System.out.println(palindromo + " não é um palíndromo...");
                    teste = false;
                    break;
                }
            }

            if (teste){
                System.out.println(palindromo + " é um palíndromo!");
            }
        }
    }

    public static void main(String[] args) {

        //Estava com saudades de POO
        Palindromo palindromo1 = new Palindromo("123321");
        Palindromo palindromo2 = new Palindromo("1235321");

        Palindromo palindromo3 = new Palindromo("1423261");
        Palindromo palindromo4 = new Palindromo("123421");

        Palindromo.EhPalindromo(palindromo1.valor);
        Palindromo.EhPalindromo(palindromo2.valor);
        Palindromo.EhPalindromo(palindromo3.valor);
        Palindromo.EhPalindromo(palindromo4.valor);
    }
}
