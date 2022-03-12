package ma.cigma.controllers;

import ma.cigma.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ClientControllers {
    @Value("${api.url}")
    private String apiUrl;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping(value = {"/", "/clients"})
    public String home(Model model) {
        model.addAttribute("client",new Client());
        List<Client> clients = restTemplate.getForObject(
                apiUrl+"/clients/all",
                List.class);
        model.addAttribute("clients",clients);
        return "index-client";
    }
}
