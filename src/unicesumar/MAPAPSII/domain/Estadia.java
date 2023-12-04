package unicesumar.MAPAPSII.domain;

public class Estadia {
    private Responsavel responsavel;
    private Crianca crianca;
    private int tempoUtilizado; // minutes

    public Estadia(Responsavel responsavel, Crianca crianca, int tempoUtilizado) {
        this.responsavel = responsavel;
        this.crianca = crianca;
        this.tempoUtilizado = tempoUtilizado;
    }

    public double calcularValorEstadia() {
        double valorPorMinuto = 1.50;
        double valorTotal = tempoUtilizado * valorPorMinuto;

        if (tempoUtilizado > 60) {
            valorTotal *= 0.85; // 15%
        } else if (tempoUtilizado > 40) {
            valorTotal *= 0.90; // 10%
        } else if (tempoUtilizado > 20) {
            valorTotal *= 0.95; // 5%
        }

        return valorTotal;
    }


    public Responsavel getResponsavel() {
        return responsavel;
    }

    public Crianca getCrianca() {
        return crianca;
    }

    public int getTempoUtilizado() {
        return tempoUtilizado;
    }
}

