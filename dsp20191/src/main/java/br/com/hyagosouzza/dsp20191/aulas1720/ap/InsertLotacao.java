package br.com.hyagosouzza.dsp20191.aulas1720.ap;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Lotacao;

public class InsertLotacao extends PersistenciaJdbc {

    public void insertLotacao(Lotacao lotacao) throws Exception {

        preparaPersistencia();

        String sql = "INSERT INTO LOTACOES " +
                "VALUES('" + lotacao.getId() +
                "','" + lotacao.getDataInicial() +
                "','" + lotacao.getDataFinal() +
                "','" + lotacao.getDepartamento().getId() +
                "','" + lotacao.getCargo().getId() +
                "','" + lotacao.getFuncionario().getId() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("A lotação foi persistida corretamente.");
        stmt.close();
        connection.close();
    }
}