package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;

public interface IFactureDao {
    Facture save(Facture facture);
    Facture update(Facture facture);
    void deleteById(long id);
    Facture findById(long id);
}
