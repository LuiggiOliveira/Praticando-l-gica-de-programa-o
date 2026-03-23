package lista2.questao7;

public class TestForma {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);
        Retangulo r1 = new Retangulo(10, 5);
        Quadrado q1 = new Quadrado(5);

        System.out.println("-> Círculos:");
        System.out.printf("* Área = raio² * pi = %.2f", c1.calcArea());
        System.out.println();
        System.out.printf("* Perímetro = 2 * raio * pi = %.2f", c1.calcPerimetro());
        System.out.println("\n");

        System.out.println("-> Retângulo:");
        System.out.printf("* Área = lado * altura = %.2f", r1.calcArea());
        System.out.println();
        System.out.printf("* Perímetro = 2 * (lado + altura) = %.2f", r1.calcPerimetro());
        System.out.println("\n");

        System.out.println("-> Quadrado:");
        System.out.printf("* Área = lado²= %.2f", q1.calcArea());
        System.out.println();
        System.out.printf("* Perímetro = 4 * lado = %.2f", q1.calcPerimetro());
    }
}
