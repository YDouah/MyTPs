package ma.cigma.pfe.service;

import lombok.Getter;
import lombok.Setter;
import ma.cigma.pfe.doa.IClientDao;
import ma.cigma.pfe.models.Client;

import java.util.List;

@Getter
@Setter
public class ClientServiceImpl implements IClientService{

    private IClientDao clientDao;

    @Override
    public Client save(Client client) {
        return clientDao.save(client);
    }

    @Override
    public Client modify(Client client) {
        return clientDao.update(client);
    }

    @Override
    public void removeById(long id) {
        clientDao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return clientDao.findById(id);
    }

    @Override
    public List<Client> getAll() {
        return clientDao.findAll();
    }
}
