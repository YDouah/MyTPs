package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @PostMapping
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @PutMapping
    public Client modify(@RequestBody Client client) {
        return clientService.modify(client);
    }

    @DeleteMapping("{id}")
    public void removeById(@PathVariable long id) {
        clientService.removeById(id);
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable long id) {
        return clientService.getById(id);
    }

    @GetMapping
    public List<Client> getAll() {
        return clientService.getAll();
    }

    public Client findByName(String name) {
        return clientService.findByName(name);
    }
}
