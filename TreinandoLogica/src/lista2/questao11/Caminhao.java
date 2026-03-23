package lista2.questao11;

public class Caminhao extends Veiculo{
    private int qtdEixos;
    private int cargaMaxima;

    public Caminhao(String marca, String modelo, int qtdMarchas, int qtdRodas, int velocidade, boolean possuiMotor, int qtdEixos, int cargaMaxima) {
        super(marca, modelo, qtdMarchas, qtdRodas, velocidade, possuiMotor);
        this.qtdEixos = qtdEixos;
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void imprimirInfo() {
        System.out.printf("""
                \n[INFO: CAMINHÃO]
                |MARCA: %s
                |MODELO: %s
                |QTD MARCHAS: %d
                |QTD RODAS: %d
                |VELOCIDADE (km/h): %d
                |POSSUI MOTOR: %B
                |QTD EIXOS: %d
                |CARGA MÁXIMA (t): %d
                """, this.getMarca(), this.getModelo(), this.getQtdMarchas(), this.getQtdRodas(), this.getVelocidade(),
                this.getPossuiMotor(), this.qtdEixos, this.cargaMaxima);
    }
}
