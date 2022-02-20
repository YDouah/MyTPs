package ma.education.spring.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import ma.education.tp3.Client;

public class TestSpringIocBeanFactory {

	public static void main(String[] args) {
		
		final Resource resource = new ClassPathResource("spring.xml");
		
		final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		
		final XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		
		xmlBeanDefinitionReader.loadBeanDefinitions(resource);
		
		Client client = (Client) beanFactory.getBean("clt");
	}
	
//	BeanFactory est la version basic de IOC Container
//		BeanFactory instancier les objects a la demande lorsque la methode getBean() est appelle	
	
//	ApplicationContext est l'extend de BeanFactory
//		ApplicationContext cree les object meme si on n'appelle pas la methode getBean()

}
