package br.com.hyagosouzza.dsp20191.jpa2.entidades;

import java.util.List;
import javax.persistence.*;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cpf;

    private String nome;

    private String email;

    @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Carro> carros;

    public Pessoa(String cpf, String nome, String email, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
