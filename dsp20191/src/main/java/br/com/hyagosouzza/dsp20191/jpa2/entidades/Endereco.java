package br.com.hyagosouzza.dsp20191.jpa2.entidades;

import javax.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String quadra;

    private String lote;

    private String rua;

    private String numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereco(String quadra, String lote, String rua, String numero) {
        this.quadra = quadra;
        this.lote = lote;
        this.rua = rua;
        this.numero = numero;
    }
}
