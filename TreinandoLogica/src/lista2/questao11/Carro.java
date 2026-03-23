package lista2.questao11;

public class Carro extends Veiculo{
    private int qtdPortas;
    private String classificacao; //SUV, Sedan ou Hatch

    public Carro(String marca, String modelo, int qtdMarchas, int qtdRodas, int velocidade, boolean possuiMotor, int qtdPortas, String classificacao) {
        super(marca, modelo, qtdMarchas, qtdRodas, velocidade, possuiMotor);
        this.qtdPortas = qtdPortas;
        this.classificacao = classificacao;
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
                |QTD PORTAS: %d
                |CLASSIFICAÇÃO: %s
                """, this.getMarca(), this.getModelo(), this.getQtdMarchas(), this.getQtdRodas(), this.getVelocidade(),
                this.getPossuiMotor(), this.qtdPortas, this.classificacao);
    }
}
