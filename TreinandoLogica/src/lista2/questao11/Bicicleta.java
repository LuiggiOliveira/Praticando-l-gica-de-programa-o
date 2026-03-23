package lista2.questao11;

public class Bicicleta extends Veiculo{
    private double tamanho;

    public Bicicleta(String marca, String modelo, int qtdMarchas, int qtdRodas, int velocidade, boolean possuiMotor, double tamanho) {
        super(marca, modelo, qtdMarchas, qtdRodas, velocidade, possuiMotor);
        this.tamanho = tamanho;
    }

    @Override
    public void imprimirInfo() {
        System.out.printf("""
                \n[INFO: BICICLETA]
                |MARCA: %s
                |MODELO: %s
                |QTD MARCHAS: %d
                |QTD RODAS: %d
                |VELOCIDADE (km/h): %d
                |POSSUI MOTOR: %B
                |TAMANHO (m): %.2f
                """, this.getMarca(), this.getModelo(), this.getQtdMarchas(), this.getQtdRodas(), this.getVelocidade(),
                this.getPossuiMotor(), this.tamanho);
    }
}
