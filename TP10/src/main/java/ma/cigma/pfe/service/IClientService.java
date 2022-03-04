package ma.cigma.pfe.service;

import ma.cigma.pfe.models.Client;

import java.util.List;

public interface IClientService {
    Client save(Client client);
    Client modify(Client client);
    void removeById(long id);
    Client getById(long id);
    List<Client> getAll();
}