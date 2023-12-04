package unicesumar.PSII.domain;

public interface Formulas {
    public Double calcularAreaQuadrado(Double largura, Double altura);

    public Double calcularAreaCirculo(Double raio);

    public Double calcularAreaLosango(Double diagonalMenor, Double diagonalMaior);

    public Double calcularAreaTriangulo(Double base, Double altura);

    public Double calcularAreaTrapezio(Double baseMaior, Double baseMenor, Double altura);
}
