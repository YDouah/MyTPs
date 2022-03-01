package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientServiceImpl implements IClientService{

    @Autowired
    private IClientDao iClientDao;

    public ClientServiceImpl(){
        System.out.println("creation bean dao");
    }

    @Override
    public Client save(Client c) {
        return null;
    }

    public IClientDao getIClientDao() {
        return iClientDao;
    }
}