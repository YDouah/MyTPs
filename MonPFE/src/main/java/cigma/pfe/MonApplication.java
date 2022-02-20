package cigma.pfe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

public class MonApplication {

	public static void main(String[] args) {
		
//		ClientController ctrl1 = new ClientController();
//		Client client = new Client(1L, "Testing");
//		ctrl1.save(client);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ClientController ctrl1 = (ClientController) context.getBean("controller");
		
		Client client = new Client (1,"ALAMI");
		
		ctrl1.save(client);
		
		
		
		
		

	}

}
