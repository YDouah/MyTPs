package ma.cigma.pfe.service;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.repositories.ClientRepository;

public class ClientServiceImpl implements ClientService{
    ClientRepository clientRepository;
    public ClientServiceImpl(ClientRepository clientRepository){
        System.out.println("Call ClientServiceImpl with ClientRepository param...");
        this.clientRepository = clientRepository;
    }

    @Override
    public Client save(Client c) {
        System.out.println("Service Layer: ClientServiceImpl...");
        return clientRepository.save(c);
    }

    public ClientServiceImpl(){
        System.out.println("Call Client ServiceImpl");
    }
}
