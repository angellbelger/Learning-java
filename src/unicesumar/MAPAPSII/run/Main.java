package unicesumar.MAPAPSII.run;

import unicesumar.MAPAPSII.domain.Crianca;
import unicesumar.MAPAPSII.domain.Estadia;
import unicesumar.MAPAPSII.domain.Responsavel;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Screen 01 - Cadastro do Responsável
        Responsavel responsavel = cadastrarResponsavel();

        // Screen 02 - Cadastro da Criança
        Crianca crianca = cadastrarCrianca(responsavel);

        // Screen 03 - Cadastro da Estadia e Resumo
        cadastrarEstadia(crianca);
    }

    private static Responsavel cadastrarResponsavel() {
        String nome = JOptionPane.showInputDialog("Digite o nome do responsável:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do responsável:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do responsável:");
        String email = JOptionPane.showInputDialog("Digite o email do responsável:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do responsável:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do responsável:"));

        Responsavel responsavel = new Responsavel(nome, cpf, telefone, email, endereco, idade);

        if (!responsavel.verificaMaiorIdade()) {
            JOptionPane.showMessageDialog(null, "O responsável precisa ser maior de 18 anos.");
            System.exit(0); // Encerrar o programa
        }

        return responsavel;
    }

    private static Crianca cadastrarCrianca(Responsavel responsavel) {
        String nomeCrianca = JOptionPane.showInputDialog("Digite o nome da criança:");
        int idadeCrianca = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da criança:"));
        String sexoCrianca = JOptionPane.showInputDialog("Digite o sexo da criança:");

        Crianca crianca = new Crianca(responsavel, nomeCrianca, idadeCrianca, sexoCrianca);

        if (!crianca.verificaIdade()) {
            JOptionPane.showMessageDialog(null, "A criança precisa ter menos de 10 anos.");
            System.exit(0); // Encerrar o programa
        }

        return crianca;
    }

    private static void cadastrarEstadia(Crianca crianca) {
        int tempoUtilizado = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo utilizado (em minutos):"));

        Estadia estadia = new Estadia(crianca.getResponsavel(), crianca, tempoUtilizado);
        double valorEstadia = estadia.calcularValorEstadia();

        JOptionPane.showMessageDialog(null, "Estadia\n" +
                "Responsável: " + estadia.getResponsavel().getNome() + "\n" +
                "Criança: " + estadia.getCrianca().getNome() + "\n" +
                "Tempo utilizado: " + estadia.getTempoUtilizado() + " minutos\n" +
                "Valor a ser cobrado: R$" + valorEstadia);
    }
}
