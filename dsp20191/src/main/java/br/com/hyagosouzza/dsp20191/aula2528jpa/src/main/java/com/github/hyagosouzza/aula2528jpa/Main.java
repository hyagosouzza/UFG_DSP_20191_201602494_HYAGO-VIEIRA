package com.github.hyagosouzza.aula2528jpa;

import com.github.hyagosouzza.aula2528jpa.entidades.Veiculo;
import com.github.hyagosouzza.aula2528jpa.persistencia.VeiculoRepositoryImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        VeiculoRepositoryImpl veiculoRepository = new VeiculoRepositoryImpl();

        //Set veiculo
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Fiat");
        veiculo.setModelo("Palio");
        veiculo.setAnoFabricacao(2005);
        veiculo.setAnoModelo(2006);
        veiculo.setPotenciaMotor(2000);

        //Cria veículo
        veiculoRepository.create(veiculo);
        System.out.println("CREATE: Veiculo " + veiculo.getId() + " criado.");

        //Recebe uma lista com o match da query
        List<Veiculo> query = veiculoRepository.findByModelo("Palio");
        System.out.println("Lista de Veículos:");
        for (Veiculo q: query) {
            System.out.println(q.toString());
        }
        System.out.println();

        //Editando veiculo
        veiculo.setPotenciaMotor(1500);
        veiculoRepository.update((veiculo));

        System.out.println("UPDATE: Veiculo editado: " + veiculo.getId());
        query = veiculoRepository.findByModelo("Palio");
        System.out.println("Lista de Veículos:");
        for (Veiculo q: query) {
            System.out.println(q.toString());
        }
        System.out.println();

        //Deletar veiculo
        veiculoRepository.delete(veiculo);
        System.out.println("DELETE: Veiculo " + veiculo.getId() + " excluído.");

        //Fecha conexão com o banco
        System.out.println("Encerrando conexão...");
        veiculoRepository.close();
    }
}
