package br.com.hyagosouzza.dsp20191.jpa2.persistencia.endereco;

import br.com.hyagosouzza.dsp20191.jpa2.entidades.Endereco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EnderecoRepositoryImpl implements EnderecoRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.hyagosouzza");
    private EntityManager em;

    public EnderecoRepositoryImpl(){
        em = emf.createEntityManager();
    }

    @Override
    public Endereco create(Endereco endereco) {
        em.getTransaction().begin();
        em.persist(endereco);
        em.getTransaction().commit();
        return endereco;
    }

    @Override
    public void close() {
        emf.close();
    }
}
