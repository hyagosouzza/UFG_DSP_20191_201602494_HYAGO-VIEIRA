package br.com.hyagosouzza.dsp20191.aulas0104.ap;

public class UnidadeFederacao {
    private String UFED_IDENUFED_SIGL;
    private String UFED_NOME;
    private String UFED_CODG_REGIAO;


    public UnidadeFederacao(String[] uf) {
        this.UFED_IDENUFED_SIGL = uf[1];
        this.UFED_NOME = uf[2];
        this.UFED_CODG_REGIAO = uf[3];
    }

    @Override
    public String toString() {
        return "Sigla: " + this.UFED_IDENUFED_SIGL + ", "
                + "Nome: " + this.UFED_NOME + ", "
                + "Região: " + this.UFED_CODG_REGIAO;
    }


}
