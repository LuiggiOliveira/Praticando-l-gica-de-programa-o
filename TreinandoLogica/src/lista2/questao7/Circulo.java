package lista2.questao7;

public class Circulo extends  Forma{
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return raio*raio*Math.PI;
    }

    @Override
    public double calcPerimetro() {
        return 2*raio*Math.PI;
    }
}
