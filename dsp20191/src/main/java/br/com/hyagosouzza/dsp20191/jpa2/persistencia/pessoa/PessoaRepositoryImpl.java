package br.com.hyagosouzza.dsp20191.jpa2.persistencia.pessoa;

import br.com.hyagosouzza.dsp20191.jpa2.entidades.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaRepositoryImpl implements PessoaRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.hyagosouzza");
    private EntityManager em;

    public PessoaRepositoryImpl(){
        em = emf.createEntityManager();
    }

    @Override
    public Pessoa create(Pessoa pessoa) {
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        return pessoa;
    }

    @Override
    public void close() {
        emf.close();
    }
}
