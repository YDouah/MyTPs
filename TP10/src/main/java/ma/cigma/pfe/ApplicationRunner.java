package ma.cigma.pfe;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.ClientNormal;
import ma.cigma.pfe.models.ClientVip;
import ma.cigma.pfe.presentation.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController clientController = context.getBean(ClientController.class);

        Client client = new Client("Mohamed");
        Client clientVip = new ClientVip("Moha", "VIP");
        Client clientNormal = new ClientNormal("Youssef", 1);

        clientController.save(client);
        clientController.save(clientVip);
        clientController.save(clientNormal);

    }
}
