package br.com.hyagosouzza.dsp20191.aulas1316.ap;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.criartabelas.CriarCargo;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.criartabelas.CriarDepartamento;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.criartabelas.CriarFuncionario;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.criartabelas.CriarLotacao;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Cargo;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Departamento;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Funcionario;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.queries.InsertCargo;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.queries.InsertDepartamento;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.queries.InsertFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        CriarCargo criarCargo = new CriarCargo();
        CriarDepartamento criarDepartamento = new CriarDepartamento();
        CriarFuncionario criarFuncionario = new CriarFuncionario();
        CriarLotacao criarLotacao = new CriarLotacao();
        try {
            criarCargo.criarTabela();
            criarDepartamento.criarTabela();
            criarFuncionario.criarTabela();
            criarLotacao.criarTabela();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Random random = new Random();
        InsertDepartamento insertDepartamento = new InsertDepartamento();
        InsertCargo insertCargo =  new InsertCargo();
        InsertFuncionario insertFuncionario = new InsertFuncionario();

        ArrayList<Cargo> cargos = new ArrayList<Cargo>();
        for (int i = 0; i < 3; i++) {
            cargos.add(new Cargo(random.nextLong(), "Cargo " + String.valueOf(i), random.nextDouble()));
        }

        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        for (int i = 0; i < 4; i++) {
            departamentos.add(new Departamento(random.nextLong(), "Departamento " + String.valueOf(i)));
        }

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        for (int i = 0; i < 10; i++) {
            funcionarios.add(new Funcionario(random.nextLong(), "Funcionário " + String.valueOf(i), random.nextLong()));
        }

        try {
            for (Cargo cargo: cargos) {
                insertCargo.insertCargo(cargo);
            }
            for (Departamento departamento: departamentos) {
                insertDepartamento.insertDepartamento(departamento);
            }
            for (Funcionario funcionario: funcionarios) {
                insertFuncionario.insertFuncionario(funcionario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
