package br.com.hyagosouzza.dsp20191.aulas1316.ap.queries;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Cargo;

public class InsertCargo extends PersistenciaJdbc {

    public void insertCargo(Cargo cargo) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO CARGOS " +
                "VALUES('" + cargo.getId() +
                "','" + cargo.getSalario() +
                "','" + cargo.getNome() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Cargo " + cargo.getNome() + " foi persistido corretamente.");
        stmt.close();
        connection.close();
    }
}