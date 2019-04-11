package br.com.hyagosouzza.dsp20191.aulas1720.ap;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;

public class DeletarObjetos extends PersistenciaJdbc {

    public void deletarObjetos(String[] tabelas) throws Exception {
        preparaPersistencia();

        for (String tabela: tabelas) {
            String sql = "DELETE FROM " + tabela;

            stmt.executeUpdate(sql);
            System.out.println("Todos os dados da tabela " + tabela + " foram excluídos.");
        }

        stmt.close();
        connection.close();
    }

}
