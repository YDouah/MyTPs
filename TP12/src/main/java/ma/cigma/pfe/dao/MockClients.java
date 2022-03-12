package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MockClients implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MockClients.class);

    @Autowired
    private IClientDao clientDao;

    @Override
    public void run(String... args) throws Exception {
        Client c1 = new Client("Marco");
        Client c2 = new Client("Michael");
        Client c3 = new Client("Polo");
        Client c4 = new Client("WV");

        clientDao.save(c1);
        clientDao.save(c2);
        clientDao.save(c3);
        clientDao.save(c4);

        clientDao.findAll().forEach(System.out::println);
    }
}