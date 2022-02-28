package ma.cigma.pfe;
import ma.cigma.pfe.presentation.ClientController;
import ma.cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MonApplication {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");
        Client clt = new Client(1, "ALAMI");
        ctrl.save(clt);
    }
}