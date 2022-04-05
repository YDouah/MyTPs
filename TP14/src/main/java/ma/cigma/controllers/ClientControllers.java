package ma.cigma.controllers;

import com.sun.corba.se.impl.interceptors.ClientRequestInfoImpl;
import ma.cigma.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;

@Controller
public class ClientControllers {

    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = {"/", "/clients"})
    public String getAll(Model model) {
        model.addAttribute("client",new Client());
        List<Client> clients = restTemplate.getForObject(apiUrl+"/clients/all", List.class);
        model.addAttribute("clients",clients);

        return "index-client";
    }

//    ADD Client
    @PostMapping("/add")
    public String addClient(Model model, @ModelAttribute Client client) {
        restTemplate.postForObject(apiUrl + "/clients", client, Client.class);

        return "redirect:/clients";
    }

//    Delete Client
    @GetMapping("/delete/{id}")
    public String deleteClientById(Model model, @PathVariable long id) {
        restTemplate.delete(apiUrl + "/clients/" + id);

        return "redirect:/clients";
    }

//    Update Client
    @GetMapping("/edit/{id}")
    public String showClient(Model model, @PathVariable long id){
        Client client = restTemplate.getForObject(apiUrl + "/clients/edit" + id, Client.class);
        model.addAttribute("client", client);
        return "edit-form";
    }

//    update Client
//    @PostMapping(path = "/edit")
//    public String submitForm(Model model, @ModelAttribute Client client){
//    restTemplate.put(apiUrl+"/clients/"+client.getId(), client, Client.class);
//    model.addAttribute("clients", client);
//
//    return "redirect:/clients";
//    }
}