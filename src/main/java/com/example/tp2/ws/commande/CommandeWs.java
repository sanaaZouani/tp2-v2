package com.example.tp2.ws.commande;

import com.example.tp2.bean.commande.Commande;
import com.example.tp2.service.commande.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/commande/")
public class CommandeWs {
    @Autowired
    private CommandeService commandeService;

    @GetMapping("ref/{ref}")
    public Commande findByRef(@PathVariable String ref) {
        return commandeService.findByRef(ref);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return commandeService.deleteByRef(ref);
    }

    @GetMapping("")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }

    @PostMapping("")
    public int save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @PutMapping("")
    public int payer(@PathVariable String ref, @PathVariable double montant) {
        return commandeService.payer(ref, montant);
    }
}
