package ma.cigma.pfe.presentation;

import lombok.Getter;
import lombok.Setter;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.IFactureService;

@Getter
@Setter
public class FactureController {
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
