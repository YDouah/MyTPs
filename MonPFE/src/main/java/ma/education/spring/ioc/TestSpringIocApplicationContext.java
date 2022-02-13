package ma.education.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.education.tp3.Client;

public class TestSpringIocApplicationContext {

	public static void main(String[] args) {
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("spring.xml");
//		Client c = (Client ) appContext.getBean("clt");
		
		Client c1 = (Client ) appContext.getBean("clt");
		Client c2 = (Client ) appContext.getBean("clt");
		
		
//		le constructreur de la class Client sera appele une seule fois
//		si le constructor est declare private, il ne sera pas apple par l'application Context

//		si9 on rend le constructor private, l'execusion va nous donner Exception in tread main
	}

}
