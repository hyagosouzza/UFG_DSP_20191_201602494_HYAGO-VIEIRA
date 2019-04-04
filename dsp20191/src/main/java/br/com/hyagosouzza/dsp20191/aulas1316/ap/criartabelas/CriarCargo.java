package br.com.hyagosouzza.dsp20191.aulas1316.ap.criartabelas;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class CriarCargo extends PersistenciaJdbc {

    public void criarTabela() throws Exception {

        preparaPersistencia();

        System.out.println("Criando a tabela Cargos");

        String sql = "CREATE TABLE IF NOT EXISTS CARGOS(\n" +
                "ID LONG NOT NULL PRIMARY KEY,\n" +
                "SALARIO DOUBLE NOT NULL," +
                "NOME VARCHAR(100) NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Cargos criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

    }
}
