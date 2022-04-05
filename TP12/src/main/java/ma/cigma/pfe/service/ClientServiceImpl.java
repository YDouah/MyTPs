package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    private IClientDao clientDao;

    @Override
    @Transactional
    public Client save(Client client) {
        return clientDao.save(client);
    }

    @Override
    @Transactional
    public Client modify(Client newClient) {
        Client oldClient = clientDao.findById(newClient.getId()).get();
        oldClient.setName(newClient.getName());
        return clientDao.save(oldClient);
    }

    @Override
    public List<Client> getAll() {
        return (List<Client>) clientDao.findAll();
    }

    @Override
    @Transactional
    public void removeById(long id) {
        clientDao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return clientDao.findById(id).get();
    }

    @Override
    public Client findByName(String name) {
        return clientDao.findByName(name);
    }

    @Override
    public Client getOne(long id) {
        return null;
    }
}
