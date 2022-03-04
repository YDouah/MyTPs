package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Address;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AddressDaoImpl  implements IAddressDao {

    @PersistenceContext
    EntityManager em;


    @Override
    public Address save(Address address) {
        em.persist(address);
        return address;
    }
}
