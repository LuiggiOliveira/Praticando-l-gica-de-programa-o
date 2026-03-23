package lista2.questao11;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int qtdRodas;
    private int qtdMarchas;
    protected int velocidade; //estava dando problema na lógica de frear e acelerar, então pra facilitar agora as filhas tem acesso
    private boolean possuiMotor;

    public Veiculo(String marca, String modelo, int qtdMarchas, int qtdRodas, int velocidade, boolean possuiMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdMarchas = qtdMarchas > 0 ? qtdMarchas : -qtdMarchas; //caso passe valor negativo, vai retornar o módulo do valor passado
        this.qtdRodas = qtdRodas > 0 ? qtdRodas : -qtdRodas; //converte para positivo caso seja passado negativo
        this.velocidade = velocidade > 0 ? velocidade : -velocidade; //mesma coisa
        this.possuiMotor = possuiMotor;
    }
    /* Ainda pode ocorrer de colocar 0 marchas, 0 rodas, mas vamos supor que isso jamais vai acontecer e, mesmo que aconteça,
    o veículo não vai acelerar e nem frear, aceitando no máximo valores negativos que já foram mais facilmente tratados.
    Por fim, se a velocidade do veículo foi passada como 0, tudo bem, pois o carro pode estar parado nesse momento. */

    public abstract void imprimirInfo();

    //detalhe: eu tinha colocado no if o "possuiMotor" como uma das condições, mas tem a bike que não tem motor, poderia
    //ter sobreescrito o método na classe BIcicleta, mas eu fiquei com preguiça e deixei assim mesmo
    public void acelerar(int incremento) {
        //verificação básica de segurança física
        if (qtdMarchas > 0 && qtdRodas >= 2) {
            if (incremento > 0) {
                this.velocidade += incremento;
                System.out.println(modelo + " acelerou + " + incremento + " km/h. Atual: " + this.velocidade + " km/h");
            }
        }
    }

    public void frear(int decremento) {
        if (decremento > 0) {
            //lógica para não deixar a velocidade ficar negativa
            if (decremento <= this.velocidade) {
                this.velocidade -= decremento;
            } else {
                this.velocidade = 0;
            }
            System.out.println(modelo + " freou - " + decremento + " km/h. Atual: " + this.velocidade + " km/h");
        }
    }

    //GETTERS
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getQtdMarchas() {
        return qtdMarchas;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean getPossuiMotor() {
        return possuiMotor;
    }
}
