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
    public Client modify(Client client) {

        return clientDao.update(client);
    }

    @Override
    @Transactional
    public void removeById(long id) {
        clientDao.deleteById(id);
    }

    @Override
    @Transactional
    public Client getById(long id) {

        return clientDao.findById(id);
    }

    @Override
    @Transactional
    public List<Client> getAll() {

        return clientDao.findAll();
    }
}