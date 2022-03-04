package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FactureController {

    @Autowired
    private IFactureService factureService;

    public Facture create(Facture facture) {
        return factureService.create(facture);
    }

    public void modify(Facture facture) {
        factureService.modify(facture);
    }

    public Facture getById(long id) {
        return factureService.getById(id);
    }

    public void deleteById(long id) {
        factureService.removeById(id);
    }
}
