package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddressDaoImpl  implements IAddressDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unitClients");
    EntityManager em = emf.createEntityManager();


    @Override
    public Address save(Address address) {
        em.getTransaction().begin();
        em.persist(address);
        em.getTransaction().commit();

        return address;
    }
}
