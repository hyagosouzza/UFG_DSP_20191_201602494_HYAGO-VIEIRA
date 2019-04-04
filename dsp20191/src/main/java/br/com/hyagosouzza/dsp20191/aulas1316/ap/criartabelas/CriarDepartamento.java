package br.com.hyagosouzza.dsp20191.aulas1316.ap.criartabelas;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class CriarDepartamento extends PersistenciaJdbc {

    public void criarTabela() throws Exception {

        preparaPersistencia();

        System.out.println("Criando a tabela Departamentos");

        String sql = "CREATE TABLE IF NOT EXISTS DEPARTAMENTOS(\n" +
                "ID LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Departamentos criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

    }
}
