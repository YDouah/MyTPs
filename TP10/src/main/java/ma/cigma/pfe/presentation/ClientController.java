package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private IClientService clientService;

    public Client save(Client client) {

        return clientService.save(client);
    }

    public Client modify(Client client) {

        return clientService.modify(client);
    }

    public void removeById(long id) {

        clientService.removeById(id);
    }

    public Client getById(long id) {

        return clientService.getById(id);
    }

    public List<Client> getAll() {

        return clientService.getAll();
    }
}