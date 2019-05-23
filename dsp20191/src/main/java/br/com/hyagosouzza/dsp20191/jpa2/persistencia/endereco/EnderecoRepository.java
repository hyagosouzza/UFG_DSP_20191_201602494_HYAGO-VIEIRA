package br.com.hyagosouzza.dsp20191.jpa2.persistencia.endereco;

import br.com.hyagosouzza.dsp20191.jpa2.entidades.Endereco;

public interface EnderecoRepository {

    Endereco create(Endereco endereco);

    void close();
}
