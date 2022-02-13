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

}
