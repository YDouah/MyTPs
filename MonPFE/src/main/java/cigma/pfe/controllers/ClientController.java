package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;
import cigma.pfe.services.ClientService;

public class ClientController {
	
	ClientService clientServices;
	
	public ClientController(ClientService clientServices) {
		System.out.println("Call ClientConroller with ClientService param...");
	}
	
	public void setClientServices(ClientService clientServices) {
		this.clientServices = clientServices;
	}
	
	public Client save(Client c) {
		System.out.println("ClientController level...");
		
		return clientServices.save(c);
	}
	
	public ClientController() {
		System.out.println("Call ClientController...");
	}

	

	
	
}
