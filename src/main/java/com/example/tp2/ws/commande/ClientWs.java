package com.example.tp2.ws.commande;

import com.example.tp2.bean.commande.Client;
import com.example.tp2.service.commande.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client/")
public class ClientWs {
    @Autowired
    private ClientService clientService;

    @GetMapping("cin/{cin}")
    public Client findByCin(@PathVariable String cin) {
        return clientService.findByCin(cin);
    }


    @DeleteMapping("cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return clientService.deleteByCin(cin);
    }

    @GetMapping("")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("")
    public int save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @PutMapping("")
    public int update(@RequestBody Client client) {
        return clientService.update(client);
    }

}
