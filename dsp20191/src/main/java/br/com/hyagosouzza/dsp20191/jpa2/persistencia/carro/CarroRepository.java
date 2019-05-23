package br.com.hyagosouzza.dsp20191.jpa2.persistencia.carro;

import br.com.hyagosouzza.dsp20191.jpa2.entidades.Carro;


public interface CarroRepository {

    Carro create(Carro veiculo);

    void close();
}
