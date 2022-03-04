package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class FactureDaoImpl implements IFactureDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public Facture save(Facture facture) {
        return persist(facture);
    }

    @Override
    public Facture update(Facture newFacture) {
        Facture factureFound = getById(newFacture.getId());
        factureFound.setDate(newFacture.getDate());
        factureFound.setAmount(newFacture.getAmount());

        return persist(factureFound);
    }

    @Override
    public void deleteById(long id) {
        Facture facture = getById(id);
        em.remove(facture);
    }

    @Override
    public Facture findById(long id) {
        return getById(id);
    }

    private Facture persist(Facture facture) {
        em.persist(facture);
        return facture;
    }

    private Facture getById(long id) {
        return em.find(Facture.class, id);
    }
}

