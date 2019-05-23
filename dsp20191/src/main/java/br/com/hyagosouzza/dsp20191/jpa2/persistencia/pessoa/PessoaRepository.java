package br.com.hyagosouzza.dsp20191.jpa2.persistencia.pessoa;


import br.com.hyagosouzza.dsp20191.jpa2.entidades.Pessoa;

public interface PessoaRepository {

    Pessoa create(Pessoa pessoa);

    void close();
}
