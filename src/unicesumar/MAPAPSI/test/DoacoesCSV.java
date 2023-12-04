package unicesumar.MAPAPSI.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Este programa Java realiza a leitura e manipulação de registros em um arquivo CSV de doações de sangue.
 */
public class DoacoesCSV {

    private static final String SEPARATOR = ",";
    private static final String CSV_HEADER = "Código,Nome,CPF,Data de Nascimento,Tipo Sanguíneo,mls Doados";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o caminho do arquivo CSV (ex: C:\\CSV\\doacoes.csv): ");
        String filePath = scanner.nextLine();

        try {
            List<String[]> doacoes = lerArquivoCSV(filePath);

            int escolha;
            do {
                exibirMenu();
                escolha = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha após o número

                switch (escolha) {
                    case 1:
                        exibirConteudo(doacoes);
                        break;
                    case 2:
                        adicionarDoacao(scanner, doacoes);
                        salvarArquivoCSV(filePath, doacoes);
                        break;
                    case 3:
                        deletarDoacao(scanner, doacoes);
                        salvarArquivoCSV(filePath, doacoes);
                        break;
                    case 0:
                        System.out.println("Encerrando o programa. Adeus!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

            } while (escolha != 0);

        } catch (IOException e) {
            System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }

    /**
     * Lê o arquivo CSV e retorna a lista de doações.
     */
    private static List<String[]> lerArquivoCSV(String filePath) throws IOException {
        List<String[]> doacoes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                doacoes.add(line.split(SEPARATOR));
            }
        }

        return doacoes;
    }

    /**
     * Exibe o conteúdo do arquivo CSV na tela.
     */
    private static void exibirConteudo(List<String[]> doacoes) {
        System.out.println("--------------------------------------------");
        System.out.println(CSV_HEADER);
        System.out.println("\n--------------------------------------------");
        for (String[] doacao : doacoes) {
            System.out.println(String.join(SEPARATOR, doacao));
        }
        System.out.println("--------------------------------------------");
    }

    /**
     * Adiciona uma nova doação à lista.
     */
    private static void adicionarDoacao(Scanner scanner, List<String[]> doacoes) {
        System.out.println("Informe os detalhes da nova doação:");

        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data de Nascimento (AAAA-MM-DD): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Tipo Sanguíneo: ");
        String tipoSanguineo = scanner.nextLine();

        System.out.print("mls Doados: ");
        String mlsDoados = scanner.nextLine();

        doacoes.add(new String[]{codigo, nome, cpf, dataNascimento, tipoSanguineo, mlsDoados});
    }

    /**
     * Deleta uma doação da lista com base no código fornecido.
     */
    private static void deletarDoacao(Scanner scanner, List<String[]> doacoes) {
        System.out.print("Informe o código da doação a ser deletada: ");
        String codigoDeletar = scanner.nextLine();

        doacoes.removeIf(doacao -> doacao[0].equals(codigoDeletar));
    }

    /**
     * Salva a lista de doações em um arquivo CSV.
     */
    private static void salvarArquivoCSV(String filePath, List<String[]> doacoes) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(CSV_HEADER);
            writer.newLine();

            for (String[] doacao : doacoes) {
                writer.write(String.join(SEPARATOR, doacao));
                writer.newLine();
            }
        }
    }

    /**
     * Exibe o menu de opções.
     */
    private static void exibirMenu() {
        System.out.println("\n---------- HEMEPAR | CWB ----------");
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Lista de Doações");
        System.out.println("2 - Adicionar nova doação");
        System.out.println("3 - Deletar doação");
        System.out.println("0 - Encerrar o programa");
        System.out.print("Opção: ");
    }
}
