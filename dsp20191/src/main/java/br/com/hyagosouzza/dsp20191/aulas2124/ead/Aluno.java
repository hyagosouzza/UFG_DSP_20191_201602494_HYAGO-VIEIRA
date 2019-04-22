package br.com.hyagosouzza.dsp20191.aulas2124.ead;

public class Aluno {
    private String nome;
    private Long matricula;
    private String disciplina;
    private Double frequencia;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome, Long matricula, String disciplina, Double frequencia, Double nota1, Double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.frequencia = frequencia;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public String aprovado() {
        if(getFrequencia() >= 0.75 && (getNota1() + getNota2())/2 >= 6) {
            return "Aluno " + this.getNome() + ": Aprovado";
        } else {
            return "Aluno " + this.getNome() + ": Reprovado";
        }
    }

    @Override
    public String toString() {
        return this.getNome()+","+this.getMatricula()+","+this.getDisciplina()+","+this.getFrequencia()+","+
                this.getNota1()+","+this.getNota2();
    }
}
