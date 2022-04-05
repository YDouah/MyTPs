package ma.cigma.controllers;

import com.sun.corba.se.impl.interceptors.ClientRequestInfoImpl;
import ma.cigma.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.jws.WebParam;
import java.util.List;
import java.util.Optional;

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
        restTemplate.postForObject(apiUrl + "/clients/add", client, Client.class);

        return "redirect:/clients";
    }

//    Delete Client
    @GetMapping("/delete/{id}")
    public String deleteClientById(Model model, @PathVariable long id) {
        restTemplate.delete(apiUrl + "/clients/" + id);

        return "redirect:/clients";
    }

//    Update Client
    @GetMapping(path = {"/edit","/edit/{id}"})
    public String editClientById(@PathVariable("id") long id, Model model ) {
        Client c = restTemplate.getForObject(apiUrl + "/clients/" + id , Client.class);
        model.addAttribute("client", c );
            return "edit-form";
    }

//    update Client
    @PostMapping(value = "/edit")
    public String submitForm(@ModelAttribute("client") Client client){
        restTemplate.put(apiUrl + "/clients/" + client.getId(), client);

        return "redirect:/clients";
    }
}