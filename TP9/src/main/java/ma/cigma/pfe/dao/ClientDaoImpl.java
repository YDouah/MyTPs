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

    @Override
    public Client update(Client newClient) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class,newClient.getId());
        currentClient.setName(newClient.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null;
    }
    @Override
    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }

    @Override
    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }
}