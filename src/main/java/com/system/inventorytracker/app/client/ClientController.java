package com.system.inventorytracker.app.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/client") // This means URL's start with /demo (after Application path)
public class ClientController {

    @Autowired
    public ClientService clientService;

    @GetMapping(path="/all")
    @ResponseBody
    public Page<Client> getAllClient () {
        return clientService.findAll();
    }

    @PostMapping(path="/addClient")
    @ResponseBody
    public Client addClient (@RequestBody Client client) {
        return clientService.save(client);
    }

    @GetMapping(path="/getClient")
    @ResponseBody
    public Client getClient (@RequestParam Long id) {
        return clientService.getClient(id);
    }

    @PutMapping(path="/editClient")
    @ResponseBody
    public Client editClient (@RequestBody Client client) {
        return clientService.update(client);
    }

    @DeleteMapping(path="/deleteClient")
    @ResponseBody
    public void deleteClient (@RequestParam Long id) {
        clientService.deleteById(id);
    }
}
