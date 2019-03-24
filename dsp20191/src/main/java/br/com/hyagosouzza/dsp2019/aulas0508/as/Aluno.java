package br.com.hyagosouzza.dsp2019.aulas0508.as;

public class Aluno {

    private String nome;
    private Long matricula;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome, Long matricula, Double nota1, Double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.matricula + ", " + this.nota1 + ", " + this.nota2 + "\n";
    }

}
