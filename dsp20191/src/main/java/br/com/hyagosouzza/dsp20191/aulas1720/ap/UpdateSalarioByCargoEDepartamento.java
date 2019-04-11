package br.com.hyagosouzza.dsp20191.aulas1720.ap;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Cargo;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Departamento;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Funcionario;

import java.sql.ResultSet;

public class UpdateSalarioByCargoEDepartamento extends PersistenciaJdbc {

    public void updateSalario(Cargo cargo) throws Exception {

        preparaPersistencia();

        String sql = "UPDATE CARGOS\n" +
                "SET SALARIO = "+ 2.500 + "\n" +
                "WHERE ID=" + cargo.getId();

        stmt.executeUpdate(sql);
        System.out.println("O Cargo "+ cargo.getNome() +
                " teve o salário alterado.");

        String sqlLotacao = "SELECT FUNCIONARIO FROM LOTACOES\n" +
                "WHERE CARGO=" + cargo.getId();

        ResultSet resultSet = stmt.executeQuery(sqlLotacao);

        while(resultSet.next()) {
            listarFuncionarios(resultSet.getLong(1));
        }

        stmt.close();
        connection.close();

    }

    public void listarFuncionarios(Long id) throws Exception {

        preparaPersistencia();

        String sql = "SELECT NOME FROM FUNCIONARIOS WHERE ID=" + id;

        ResultSet resultSet = stmt.executeQuery(sql);
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }

}
