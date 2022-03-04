package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

@Repository
public class ClientDaoImpl implements IClientDao{

    @PersistenceContext
    EntityManager em;

    @Override
    public Client save(Client client) {
        em.persist(client);
        return client;
    }

    @Override
    public Client update(Client client) {
        em.merge(client);
        return null;
    }

    @Override
    public void deleteById(long id) {
        Client client = em.find(Client.class, id);
        em.remove(client);
    }

    @Override
    public Client findById(long id) {
        return em.find(Client.class, id);
    }

    @Override
    public List<Client> findAll() {
        return em.createQuery("from Client", Client.class).getResultList();
    }
}
