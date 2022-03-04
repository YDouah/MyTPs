package ma.cigma.pfe;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.presentation.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController clientController = context.getBean(ClientController.class);

        Client client1 = new Client("Mohamed");
        Client client2 = new Client("Jawad");
        Client client3 = new Client("Ayman");
        Client client4 = new Client("Abdellah");

        // Test 1 => Save 3 clients
        client1 = clientController.save(client1);
        client2 = clientController.save(client2);
        client3 = clientController.save(client3);
        client4 = clientController.save(client4);

        // Test 2 => getAll clients
        clientController
                .getAll()
                .forEach(c -> System.out.println(c));

        // Test 3 => getOne
        System.out.println(clientController.getById(1));

        // Test 4 Modify
        client1.setName("new Name");
        clientController.modify(client1);

        // Test 5 remove
        clientController.removeById(2);

        //
        clientController
                .getAll()
                .forEach(c -> System.out.println(c));


        // Test findByName
        System.out.println("findByName : " + clientController.findByName("Said"));

    }
}
