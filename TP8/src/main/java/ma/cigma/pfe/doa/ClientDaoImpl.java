package ma.cigma.pfe.doa;

import ma.cigma.pfe.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collection;
import java.util.List;

public class ClientDaoImpl implements IClientDao{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit-oracle");
    EntityManager em = emf.createEntityManager();

    @Override
    public Client save(Client client) {
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
        return client;
    }

    @Override
    public Client update(Client client) {
        em.getTransaction().begin();
        em.merge(client);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public void deleteById(long id) {
        em.getTransaction().begin();
        Client client = em.find(Client.class, id);
        em.remove(client);
        em.getTransaction().commit();
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
