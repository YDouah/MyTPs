package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

public interface IClientService {

    public Client save(Client c);
    public IClientDao getIClientDao();
}
