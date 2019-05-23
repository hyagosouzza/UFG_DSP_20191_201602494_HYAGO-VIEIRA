package br.com.hyagosouzza.dsp20191.jpa2.persistencia.loja;


import br.com.hyagosouzza.dsp20191.jpa2.entidades.Loja;

public interface LojaRepository {

    Loja create(Loja loja);

    void close();
}
