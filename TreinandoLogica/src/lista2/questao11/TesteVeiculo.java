package lista2.questao11;

public class TesteVeiculo {
    public static void main(String[] args) {
        Automovel auto = new Automovel("Toyota", "Corolla", 6, 4, 180,
                true, 150, 5);
        Bicicleta bike = new Bicicleta("Caloi", "Elite Carbon", 21, 2, 45,
                false, 1.10);
        Caminhao truck = new Caminhao("Volvo", "FH 540", 12, 6, 110,
                true, 3, 40);
        Carro car = new Carro("Jeep", "Compass", 9, 4, 200, true,
                4, "SUV");

        //EXIBINDO DADOS
        System.out.println("=== RELATÓRIO DE VEÍCULOS ===");
        auto.imprimirInfo();
        bike.imprimirInfo();
        truck.imprimirInfo();
        car.imprimirInfo();

        //TESTANDO SE ESTÁ ACELERANDO E FREANDO
        System.out.println("=== INICIANDO TESTE DE MOVIMENTAÇÃO ===\n");

        // --- TESTE DO CAMINHÃO ---
        System.out.println("--- [CAMINHÃO: " + truck.getModelo() + "] ---");
        truck.acelerar(40); // 0 + 40 = 40
        truck.acelerar(30); // 40 + 30 = 70
        truck.frear(20);    // 70 - 20 = 50
        truck.frear(100);   // 50 - 100 -> Deve cravar em 0 (Segurança!)

        System.out.println("\n---------------------------------------\n");

        // --- TESTE DA BICICLETA ---
        System.out.println("--- [BICICLETA: " + bike.getModelo() + "] ---");
        bike.acelerar(15);  // 0 + 15 = 15
        bike.acelerar(10);  // 15 + 10 = 25
        bike.frear(5);      // 25 - 5 = 20
        bike.acelerar(-50); // Valor negativo -> Deve ser ignorado pelo seu 'if'

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
