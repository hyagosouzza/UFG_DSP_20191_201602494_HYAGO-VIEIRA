package com.github.hyagosouzza.aula2528jpa.persistencia;

import com.github.hyagosouzza.aula2528jpa.entidades.Veiculo;

import java.util.List;

public interface VeiculoRepository {

    Veiculo create(Veiculo veiculo);

    Veiculo read(Long id);

    List<Veiculo> findByModelo(String modelo);

    Veiculo update(Veiculo veiculo);

    void delete(Veiculo veiculo);

    void close();
}
