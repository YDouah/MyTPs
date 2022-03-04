package ma.cigma.pfe.service;

import lombok.Getter;
import lombok.Setter;
import ma.cigma.pfe.dao.IFactureDao;
import ma.cigma.pfe.models.Facture;

@Setter
@Getter
public class FactureServiceImpl implements IFactureService {
    private IFactureDao factureDao;

    @Override
    public Facture create(Facture facture) {
        return factureDao.save(facture);
    }

    @Override
    public Facture modify(Facture facture) {
        return factureDao.update(facture);
    }

    @Override
    public void removeById(long id) {
        factureDao.deleteById(id);
    }

    @Override
    public Facture getById(long id) {
        return factureDao.findById(id);
    }
}
