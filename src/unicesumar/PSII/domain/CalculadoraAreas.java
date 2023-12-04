package unicesumar.PSII.domain;

public class CalculadoraAreas implements Formulas {

    @Override
    public Double calcularAreaQuadrado(Double largura, Double altura) {
        return largura * altura;
    }

    @Override
    public Double calcularAreaCirculo(Double raio) {
        // Supondo que Pi seja uma constante já definida
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public Double calcularAreaLosango(Double diagonalMenor, Double diagonalMaior) {
        return (diagonalMenor * diagonalMaior) / 2;
    }

    @Override
    public Double calcularAreaTriangulo(Double base, Double altura) {
        return (base * altura) / 2;
    }

    @Override
    public Double calcularAreaTrapezio(Double baseMaior, Double baseMenor, Double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}

