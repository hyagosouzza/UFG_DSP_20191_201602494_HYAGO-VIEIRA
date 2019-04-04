package br.com.hyagosouzza.dsp20191.aulas1316.ap.queries;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Departamento;

public class InsertDepartamento extends PersistenciaJdbc {

    public void insertDepartamento(Departamento departamento) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO DEPARTAMENTOS " +
                "VALUES('" + departamento.getId() +
                "','" + departamento.getNome() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Departamento " + departamento.getNome() + " foi persistido corretamente.");
        stmt.close();
        connection.close();
    }
}
