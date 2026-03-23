package lista2.questao9;

import java.util.EmptyStackException;

public class TestEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Marcelo", "Rodrigues", 2500.00);
        Empregado empregado2 = new Empregado("Raquel", "Santana", 2750.00);
        Empregado empregado3 = new Empregado("Lucas", "Silva", 2650.00);
        Empregado empregado4 = new Empregado("Jessica", "Carvalho", 2550.00);

        System.out.println("Quantidade de empregados cadastrados: " + Empregado.getQtdCadastros());

        empregado1.exibirInfo();
        empregado1.setNome("Abner");
        empregado1.setSobrenome("Carlos");
        empregado1.setSalario(2450.00);
        empregado1.exibirInfo();

        empregado2.exibirInfo();
        empregado3.exibirInfo();
        empregado4.exibirInfo();
    }
}
