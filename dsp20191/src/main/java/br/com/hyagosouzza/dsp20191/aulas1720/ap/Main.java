package br.com.hyagosouzza.dsp20191.aulas1720.ap;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Cargo;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Departamento;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Funcionario;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Lotacao;

import java.sql.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        AlterarFuncionario alterarFuncionario = new AlterarFuncionario();
        DeletarObjetos deletarObjetos = new DeletarObjetos();
        InsertLotacao insertLotacao = new InsertLotacao();
        Cargo cargo = new Cargo((long)1, "Técnico Arquitetural", 2.000);
        Departamento departamento =  new Departamento((long)1, "Departamento de Arquitetura");
        UpdateSalarioByCargoEDepartamento updateSalarioByCargoEDepartamento = new UpdateSalarioByCargoEDepartamento();
        Random random = new Random();
        Lotacao lotacao = new Lotacao(
                random.nextLong(), new Date(2019-1900,04-1,10),  new Date(2020-1900,04-1,10),
                cargo, departamento,
                new Funcionario((long)1, "Hyago", (long)201602494));
        try {
            insertLotacao.insertLotacao(lotacao);

            alterarFuncionario.alterarNomeFuncionarioById((long)201602494, "HyagoVieira");

            updateSalarioByCargoEDepartamento.updateSalario(cargo);

            String[] tabelas = {"LOTACOES", "FUNCIONARIOS", "CARGOS", "DEPARTAMENTOS"};
            deletarObjetos.deletarObjetos(tabelas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
