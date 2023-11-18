package unicesumar.run;
import java.util.Scanner;

/**
 * CalculadoraEstrutural é um programa desenvolvido em Java.
 * Ele permite que o usuário realize operações matemáticas básicas, e a obtenção de valores irracionais e constantes
 * constantes.
 * Ex:
 * matemáticas como pi (π), o número de Euler (e) e a razão áurea (phi).
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html">Documentação do JavaDoc</a>
 * @author Angell Belger
 * @version 1.0
 */
public class CalculadoraEstrutural {
    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args Os argumentos de linha de comando (não utilizados neste programa).
     */

    public static void main(String[] args) {

        // Código Main do programa aqui

        Scanner sc = new Scanner(System.in);

        double operandoA, operandoB, resultado;

        operandoA = operandoB = resultado = 0;

        char operacao;

        System.out.println("Escolha a operação: ");

        System.out.println("Soma______________: + ");

        System.out.println("Subtração_________: - ");

        System.out.println("Multiplicação_____: * ");

        System.out.println("Divisão___________: / ");

        System.out.println("Potência__________: ^ ");

        System.out.println("Valor de Pi_______: p ");

        System.out.println("Valor de PHI______: f ");

        System.out.println("Valor de e________: e ");

        System.out.println("----------------------");

        System.out.println("Sair______________: s \n");

        System.out.println();

        operacao = sc.next().charAt(0);

        if (operacao == 's') {

        } else if (operacao == 'p') {

            resultado = getPi();

            System.out.printf("pi= %.2f ", resultado);

        } else if (operacao == 'f') {

            resultado = getFi();

            System.out.printf("phi= %.2f ", resultado);

        } else if (operacao == 'e') {

            resultado = getE();

            System.out.printf("e= %.2f ", resultado);

        } else if (operacao == '+' || operacao == '-'

                || operacao == '*' || operacao == '/' || operacao == '^') {

            System.out.println("Operando A: ");

            operandoA = sc.nextDouble();

            System.out.println("Operando B: ");

            operandoB = sc.nextDouble();

            resultado = operacaoesBasicas(operandoA, operacao, operandoB);

            System.out.printf("%.2f %c %.2f = %.2f", operandoA, operacao, operandoB, resultado);

        }

    }

    /**
     * Realiza operações matemáticas básicas (adição, subtração, multiplicação, divisão, potência).
     *
     * @param x O primeiro operando.
     * @param operador O operador a ser aplicado.
     * @param y O segundo operando.
     * @return O resultado da operação.
     */

    public static double operacaoesBasicas(double x, char operador, double y) {
        // Implementação das operações básicas aqui

        double resultado = 0.0;

        switch (operador) {

            case '+':

                resultado = x + y;

                break;

            case '-':

                resultado = x - y;

                break;

            case '*':

                resultado = x * y;

                break;

            case '/':

                resultado = x / y;

                break;

            case '^':

                resultado = Math.pow(x, y);

        }

        return resultado;

    }


    /**
     * Obtém o valor de pi (π).
     *
     * @return O valor de pi (π).
     */
    public static double getPi() {

        return Math.PI;

    }

    /**
     * Obtém o valor do número de Euler (e).
     *
     * @return O valor do número de Euler (e).
     */
    public static double getE() {

        return Math.E;

    }

    /**
     * Obtém o valor da razão áurea (phi).
     *
     * @return O valor da razão áurea (phi).
     */
    public static double getFi() {

        return 1.61803398874989484820;

    }
}
