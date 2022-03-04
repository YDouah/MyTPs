package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IFactureDao;
import ma.cigma.pfe.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FactureServiceImpl implements IFactureService {
    @Autowired
    private IFactureDao factureDao;

    @Override
    @Transactional
    public Facture create(Facture facture) {
        return factureDao.save(facture);
    }

    @Override
    @Transactional
    public Facture modify(Facture facture) {
        return factureDao.update(facture);
    }

    @Override
    @Transactional
    public void removeById(long id) {
        factureDao.deleteById(id);
    }

    @Override
    @Transactional
    public Facture getById(long id) {
        return factureDao.findById(id);
    }
}
