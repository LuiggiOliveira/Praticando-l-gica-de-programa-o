package lista2.questao10;

public class TestPessoa {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luigi", 22, 'M', "(88) 999123-4002", 100.00);
        Cliente cliente2 = new Cliente("Mario", 23, 'M', "(88) 99425-4712", 200.00);

        Gerente gerente = new Gerente("Bowser", 42, 'M', 5000,123, "Vendas");

        Vendedor vendedor1 = new Vendedor("Princesa Peach", 24, 'F', 3000, 345, "Inside Sales", 500.00);
        Vendedor vendedor2 = new Vendedor("Jubileu", 30, 'M', 3000, 543, "Field Sales",600.00);

        cliente1.exibirClienteInfo();
        cliente2.exibirClienteInfo();
        gerente.exibirEmpregadoInfo();
        vendedor1.exibirEmpregadoInfo();
        vendedor2.exibirEmpregadoInfo();
    }
}
