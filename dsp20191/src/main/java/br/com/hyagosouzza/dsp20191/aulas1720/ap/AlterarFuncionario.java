package br.com.hyagosouzza.dsp20191.aulas1720.ap;

import br.com.hyagosouzza.dsp20191.aulas1316.ap.base.PersistenciaJdbc;
import br.com.hyagosouzza.dsp20191.aulas1316.ap.models.Funcionario;

public class AlterarFuncionario extends PersistenciaJdbc{

    public void alterarNomeFuncionarioById(Long id, String nome) throws Exception {

        preparaPersistencia();

        String sql = "UPDATE FUNCIONARIOS\n" +
                "SET NOME = '"+ nome + "'\n" +
                "WHERE matricula=" + id;

        stmt.executeUpdate(sql);

        System.out.println("O Funcionário teve seu nome alterado corretamente.");

        stmt.close();
        connection.close();
    }

}
