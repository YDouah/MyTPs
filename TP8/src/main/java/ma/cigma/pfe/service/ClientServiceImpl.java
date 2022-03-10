package ma.cigma.pfe.service;

import lombok.Setter;
import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

@Setter
public class ClientServiceImpl implements IClientService{

    private IClientDao dao;

    public ClientServiceImpl(){
        System.out.println("creation bean dao");
    }

    @Override
    public boolean save(Client c) {
        return dao.save(c);
    }

    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }
}