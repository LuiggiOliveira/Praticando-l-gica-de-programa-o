package lista2.questao7;

public class Quadrado extends Forma{
    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcArea(){
        return lado*lado;
    }

    public double calcPerimetro(){
        return 4*lado;
    }

    public  double getLado() {
        return lado;
    }
}
