package ma.cigma.pfe;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.presentation.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean(ClientController.class);
// Test save use case for three clients
        ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("SIHAM"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("FARAH"));
// Test modify use case for client with id==1
        ctrl.modify(new Client(1,"new Name"));
        ctrl.removeById(1);
        Client found = ctrl.getById(1);
        System.out.println(found);
    }
}