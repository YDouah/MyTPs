package ma.cigma.pfe;

import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.presentation.FactureController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        FactureController factureController = context.getBean(FactureController.class);

        // Create
        Facture factureCreated = new Facture(new Date(), 1000d);
        factureController.create(factureCreated);
        System.out.println("Facture apres creation : " + factureCreated);

        // Read
        Facture factureFound = factureController.getById(factureCreated.getId());
        System.out.println("Facture trouvee par getById : " + factureFound);

        // Update
        Facture factureUpdated = new Facture(factureCreated.getId(), new Date(),1200.75d);
        factureController.modify(factureUpdated);
        System.out.println("Facture apres modification : " + factureCreated);

        // Delete
        factureController.deleteById(factureUpdated.getId());

    }
}
