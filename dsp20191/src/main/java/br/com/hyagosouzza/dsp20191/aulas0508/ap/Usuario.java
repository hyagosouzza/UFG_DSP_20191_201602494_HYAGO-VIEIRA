package br.com.hyagosouzza.dsp20191.aulas0508.ap;

public class Usuario {

    private String nome;
    private String login;
    private String senha;

    public Usuario(String dados[]) {
        this.nome = dados[1];
        this.senha = dados[2];
        this.login = dados[0];
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.senha + ", " + this.login;
    }
}
