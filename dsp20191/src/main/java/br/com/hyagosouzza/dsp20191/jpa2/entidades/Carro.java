package br.com.hyagosouzza.dsp20191.jpa2.entidades;

import javax.persistence.*;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marca;

    private String modelo;

    public Carro(String marca, String modelo, Pessoa proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @ManyToOne
    private Pessoa proprietario;

}
