package br.com.hyagosouzza.dsp20191.jpa2.persistencia.loja;

import br.com.hyagosouzza.dsp20191.jpa2.entidades.Loja;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LojaRepositoryImpl implements LojaRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.hyagosouzza");
    private EntityManager em;

    public LojaRepositoryImpl(){
        em = emf.createEntityManager();
    }

    @Override
    public Loja create(Loja loja) {
        em.getTransaction().begin();
        em.persist(loja);
        em.getTransaction().commit();
        return loja;
    }

    @Override
    public void close() {
        emf.close();
    }
}
