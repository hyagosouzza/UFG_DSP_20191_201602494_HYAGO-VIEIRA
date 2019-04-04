package br.com.hyagosouzza.dsp20191.aulas1316.ap.queries;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Funcionario;

public class InsertFuncionario extends PersistenciaJdbc {

    public void insertFuncionario(Funcionario funcionario) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO FUNCIONARIOS " +
                "VALUES('" + funcionario.getId() +
                "','" + funcionario.getNome() +
                "','" + funcionario.getMatricula() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Funcionário " + funcionario.getNome() + " foi persistido corretamente.");
        stmt.close();
        connection.close();
    }
}