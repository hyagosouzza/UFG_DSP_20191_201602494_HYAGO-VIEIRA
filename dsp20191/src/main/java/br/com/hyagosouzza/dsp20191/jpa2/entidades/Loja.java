package br.com.hyagosouzza.dsp20191.jpa2.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loja_id")
    private Long id;

    private String nome;

    private String cidade;

    private String uf;

    @ManyToMany
    @JoinTable(name = "loja_clientes",
            joinColumns = {@JoinColumn(name = "loja_id")},
            inverseJoinColumns = {@JoinColumn(name = "cliente_id")})
    private List<Pessoa> cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Pessoa> getCliente() {
        return cliente;
    }

    public void setCliente(List<Pessoa> cliente) {
        this.cliente = cliente;
    }

    public Loja(String nome, String cidade, String uf, List<Pessoa> cliente) {
        this.nome = nome;
        this.cidade = cidade;
        this.uf = uf;
        this.cliente = cliente;
    }
}
