package ma.cigma.pfe.service;

import ma.cigma.pfe.models.Facture;

public interface IFactureService {
    Facture create(Facture facture);
    Facture modify(Facture facture);
    void removeById(long id);
    Facture getById(long id);
}