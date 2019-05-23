package br.com.hyagosouzza.dsp20191.jpa2.persistencia.carro;


import br.com.hyagosouzza.dsp20191.jpa2.entidades.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarroRepositoryImpl implements CarroRepository{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.hyagosouzza");
    private EntityManager em;

    public CarroRepositoryImpl(){
        em = emf.createEntityManager();
    }

    @Override
    public Carro create(Carro carro) {
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
        return carro;
    }

    @Override
    public void close() {
        emf.close();
    }
}
