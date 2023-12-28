package com.example.tp2.ws.commun;

import com.example.tp2.bean.commun.Paiement;
import com.example.tp2.service.commande.CommandeService;
import com.example.tp2.service.commun.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/paiement/")
@RestController
public class PaiementWs {
    @Autowired
    PaiementService paiementService;
    @Autowired
    CommandeService commandeService;

    @GetMapping("code/{code}")
    public Paiement findByCode(@PathVariable String code) {
        return paiementService.findByCode(code);
    }

    @DeleteMapping("code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return paiementService.deleteByCode(code);
    }

    @GetMapping("")
    public List<Paiement> findAll() {
        return paiementService.findAll();
    }

    @PostMapping("refCommade/{refCommande}")
    public int save(@RequestBody Paiement paiement, @PathVariable String refCommande) {
        return paiementService.save(paiement, refCommande);
    }
}
