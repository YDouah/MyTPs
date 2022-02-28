package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.ClientService;

public class ClientController {
    ClientService clientService;

    public ClientController(ClientService clientService){
        System.out.println("Call Client Controller with clientService param...");
        this.clientService = clientService;
    }

    public Client save(Client c){
        System.out.println("ClientController Level...");
        return clientService.save(c);
    }

    public ClientController(){
        System.out.println("Call ClientController...");
    }
}
