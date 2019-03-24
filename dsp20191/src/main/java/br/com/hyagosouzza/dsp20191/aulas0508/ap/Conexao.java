package br.com.hyagosouzza.dsp20191.aulas0508.ap;

public class Conexao {

    final String OS = System.getProperty("os.name").toLowerCase();

    private String sgbd;
    private String tipoConexao;
    private String bancoDados;
    private String urlBd;
    private String sistemaOperacional;

    public Conexao(String dados[]) {
        this.sgbd = dados[3];
        this.bancoDados = dados[5];
        this.tipoConexao = dados[4];
        this.urlBd = dados[6];
        this.sistemaOperacional = OS;
    }

    @Override
    public String toString() {
        return this.sgbd + ", " + this.bancoDados + ", " + this.tipoConexao + ", " + this.urlBd + ", " +
                this.sistemaOperacional;
    }
}
