package ma.cigma.pfe.doa;

import ma.cigma.pfe.models.Client;

import java.util.Collection;
import java.util.List;

public interface IClientDao {
    Client save(Client client);
    Client update(Client client);
    void deleteById(long id);
    Client findById(long id);
    List<Client> findAll();
}
