package ma.cigma.pfe.presentation;

import lombok.Setter;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;

@Setter
public class ClientController {

    private IClientService service;

    public void save(Client clt) {
        service.save(clt);
    }

    public void modify(Client c){
        service.modify(c);
    }

    public void removeById(long id){
        service.removeById(id);
    }

    public Client getById(long id){
        return service.getById(id);
    }
}