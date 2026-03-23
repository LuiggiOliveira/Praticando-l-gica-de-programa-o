package lista2.questao7;

public class Retangulo extends Quadrado{
    private final double altura;

    public Retangulo(double lado, double altura){
        super(lado);
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return this.getLado()*altura;
    }

    @Override
    public double calcPerimetro() {
        return 2*(this.getLado()+altura);
    }
}
