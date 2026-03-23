package lista2.questao11;

public class Automovel extends Veiculo{
    public int potencia;
    public int qtdPassageiros;

    public Automovel(String marca, String modelo, int qtdMarchas, int qtdRodas, int velocidade, boolean possuiMotor, int potencia, int qtdPassageiros) {
        super(marca, modelo, qtdMarchas, qtdRodas, velocidade, possuiMotor);
        this.potencia = potencia;
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public void imprimirInfo() { //lembrei que existe text block (""" """) ao invés de colocar vários prints
        System.out.printf("""
                \n[INFO: AUTOMÓVEL]
                |MARCA: %s
                |MODELO: %s
                |QTD MARCHAS: %d
                |QTD RODAS: %d
                |VELOCIDADE (km/h): %d
                |POSSUI MOTOR: %B
                |POTÊNCIA (cv): %d
                |QTD PASSAGEIROS: %d
                """, this.getMarca(), this.getModelo(), this.getQtdMarchas(), this.getQtdRodas(), this.getVelocidade(),
                this.getPossuiMotor(), this.potencia, this.qtdPassageiros);
    }
}
