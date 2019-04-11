package br.com.hyagosouzza.dsp20191.aulas1316.ap.criartabelas;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class CriarLotacao extends PersistenciaJdbc {

    public void criarTabela() throws Exception {

        preparaPersistencia();

        System.out.println("Criando a tabela Lotacoes");

        String sql = "CREATE TABLE IF NOT EXISTS LOTACOES(\n" +
                "ID LONG NOT NULL PRIMARY KEY,\n" +
                "DATA_INICIAL DATE NOT NULL,\n" +
                "DATA_FINAL DATE NOT NULL,\n" +
                "DEPARTAMENTO LONG NOT NULL,\n" +
                "CARGO LONG NOT NULL,\n" +
                "FUNCIONARIO LONG NOT NULL,\n" +
                "FOREIGN KEY (DEPARTAMENTO) REFERENCES DEPARTAMENTOS(ID),\n" +
                "FOREIGN KEY (CARGO) REFERENCES CARGOS(ID),\n" +
                "FOREIGN KEY (FUNCIONARIO) REFERENCES FUNCIONARIOS(ID),\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotacoes criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

    }
}