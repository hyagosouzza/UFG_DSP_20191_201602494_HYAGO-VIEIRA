package br.com.hyagosouzza.dsp20191.aulas1316.ap.criartabelas;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class CriarFuncionario extends PersistenciaJdbc {

    public void criarTabela() throws Exception {

        preparaPersistencia();

        System.out.println("Criando a tabela Funcionarios");

        String sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIOS(\n" +
                "ID LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL,\n" +
                "MATRICULA LONG NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionarios criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

    }
}
