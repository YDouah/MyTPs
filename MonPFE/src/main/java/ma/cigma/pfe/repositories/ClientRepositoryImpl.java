package ma.cigma.pfe.repositories;

import ma.cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository {

    @Override
    public Client save(Client c) {
        System.out.println("DAO Layer: Client RepositoryImpl Level");
        return null;
    }

    public ClientRepositoryImpl(){
        System.out.println("Call ClientRepositoryImpl...");
    }

}



