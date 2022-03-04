package ma.cigma.pfe;

import ma.cigma.pfe.models.*;
import ma.cigma.pfe.presentation.AddressController;
import ma.cigma.pfe.presentation.ClientController;
import ma.cigma.pfe.presentation.FactureController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        FactureController factureController = context.getBean(FactureController.class);

        // Creation de la facture
        Facture facture = new Facture(new Date(), 100d);

        // Création des Lignes de facture
        Produit produit1 = new Produit("Ecran" , 999f, 12);
        LigneFacture ligneFacture1 = new LigneFacture(facture, produit1, 12);

        Produit produit2 = new Produit("Laptop", 300f, 10);
        LigneFacture ligneFacture2 = new LigneFacture(facture, produit2, 10);


        /**
         * La sauvegarde de la facture impliquera
         * => la sauvegarde de produit1,produit2, ligneFacture1, ligneFacture2
         */
        facture.setLigneFactures(Arrays.asList(ligneFacture1, ligneFacture2));
        factureController.create(facture);


        // TEST 2 ------------------------------------------------------------------

        // Save Address from client
        ClientController clientController = context.getBean(ClientController.class);
        Client client1 = new Client("Yassine");
        Address address1 = new Address("Avenue MED V", "Casa", "Maroc");

        client1.setAddress(address1);
        clientController.save(client1);

        // Save client from address
        AddressController addressController = context.getBean(AddressController.class);
        Address address2 = new Address("Address 1", "Rabat", "Maroc");
        Client client2 = new Client("HAMZA");
//
        address2.setClients(Arrays.asList(client2));
        addressController.create(address2);

    }
}
