package unicesumar.MAPAPSII.domain;

public class Crianca {
    private Responsavel responsavel;
    private String nome;
    private int idade;
    private String sexo;

    public Crianca(Responsavel responsavel, String nome, int idade, String sexo) {
        this.responsavel = responsavel;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public boolean verificaIdade() {
        return idade <= 10;
    }



    public Responsavel getResponsavel() {
        return responsavel;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
}

