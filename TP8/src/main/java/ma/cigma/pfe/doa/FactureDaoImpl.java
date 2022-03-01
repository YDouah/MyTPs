package ma.cigma.pfe.doa;

import ma.cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDaoImpl implements IFactureDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit-oracle");
    EntityManager em = emf.createEntityManager();

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
        em.getTransaction().begin();
        em.remove(facture);
        em.getTransaction().commit();
    }

    @Override
    public Facture findById(long id) {
        return getById(id);
    }

    private Facture persist(Facture facture) {
        em.getTransaction().begin();
        em.persist(facture);
        em.getTransaction().commit();
        return facture;
    }

    private Facture getById(long id) {
        return em.find(Facture.class, id);
    }
}
