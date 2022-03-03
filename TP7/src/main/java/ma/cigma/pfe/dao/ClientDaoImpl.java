package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDaoImpl implements IClientDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unitClients");
    EntityManager em = emf.createEntityManager();

    @Override
    public boolean save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return true;
    }
}

